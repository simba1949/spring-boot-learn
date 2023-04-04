package top.simba1949.config;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.jackson.JsonComponent;
import top.simba1949.domain.User;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author anthony
 * @date 2023/4/4
 */
@Slf4j
@JsonComponent
public class JsonConfig {

    /**
     * 自定义序列化
     */
    public static class Serializer extends JsonSerializer<User>{

        @Override
        public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            jsonGenerator.writeStartObject(); // 标识序列化开始

            // 自定义序列化
            jsonGenerator.writeStringField("自定义序列化字段：username", user.getUsername());
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String format = user.getBirthday().format(formatter);
            jsonGenerator.writeStringField("自定义序列化字段：birthday", format);

            jsonGenerator.writeEndObject(); // 标识序列化结束
        }
    }

    /**
     * 自定义反序列化
     */
    public static class Deserializer extends JsonDeserializer<User>{

        @Override
        public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
            ObjectCodec codec = jsonParser.getCodec();
            JsonNode jsonNode = codec.readTree(jsonParser);

            // 获取对应的值
            String username = jsonNode.get("username").textValue();
            String birthday = jsonNode.get("birthday").textValue();

            User user = new User();

            // 自定义解析
            user.setUsername("自定义反序列化用户名：" + username);
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            LocalDateTime parse = LocalDateTime.parse(birthday, formatter);
            user.setBirthday(parse);

            return user;
        }
    }
}
