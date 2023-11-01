package vip.openpark.start.json;

import com.fasterxml.jackson.core.*;
import com.fasterxml.jackson.databind.*;
import lombok.extern.slf4j.Slf4j;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * @author anthony
 * @version 2023/11/1 14:36
 */
@Slf4j
public class CustomJsonComponent {

    private final static DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    /**
     * 序列化
     */
    public static class Serializer extends JsonSerializer<User> {
        @Override
        public void serialize(User user, JsonGenerator jsonGenerator, SerializerProvider serializerProvider) throws IOException {
            log.info("自定义JSON序列化开始");

            jsonGenerator.writeStartObject();

            jsonGenerator.writeStringField("username", user.getUsername());
            jsonGenerator.writeStringField("password", user.getPassword());


            String format = dateTimeFormatter.format(user.getBirthday());
            jsonGenerator.writeStringField("birthday", format);

            jsonGenerator.writeNumberField("price", user.getPrice());

            jsonGenerator.writeEndObject();
        }
    }

    /**
     * 反序列化
     */
    public static class Deserializer extends JsonDeserializer<User> {
        @Override
        public User deserialize(JsonParser jsonParser, DeserializationContext deserializationContext) throws IOException, JacksonException {
            log.info("自定义JSON反序列化开始");

            ObjectCodec codec = jsonParser.getCodec();
            JsonNode jsonNode = codec.readTree(jsonParser);

            String username = jsonNode.get("username").textValue();
            String password = jsonNode.get("password").textValue();
            String birthday = jsonNode.get("birthday").textValue();
            String price = jsonNode.get("price").textValue();

            User user = new User();
            user.setUsername(username);
            user.setPassword(password);

            LocalDateTime parse = LocalDateTime.parse(birthday, dateTimeFormatter);
            user.setBirthday(parse);

            user.setPrice(BigDecimal.ZERO);

            return user;
        }
    }
}