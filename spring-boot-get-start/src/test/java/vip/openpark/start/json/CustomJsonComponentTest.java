package vip.openpark.start.json;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/11/1 14:52
 */
@Slf4j
public class CustomJsonComponentTest {

    @Test
    public void print() throws IOException {
        User user = new User();
        user.setUsername("李白");
        user.setPassword("12");
        user.setPrice(BigDecimal.TEN);
        user.setBirthday(LocalDateTime.now());

        SimpleModule module = new SimpleModule();
        module.addSerializer(User.class, new CustomJsonComponent.Serializer());
        module.addDeserializer(User.class, new CustomJsonComponent.Deserializer());
        ObjectMapper objectMapper = new ObjectMapper().registerModule(module);

        String encodeUser = objectMapper.writer().writeValueAsString(user);
        log.info("序列化后是：{}", encodeUser);

        User decodeUser = objectMapper.reader().readValue(encodeUser, User.class);
        log.info("反序列化后是：{}", decodeUser);
    }
}