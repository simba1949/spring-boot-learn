package vip.openpark.test.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.Import;
import vip.openpark.test.SpringBootTestApplication;

/**
 * @author anthony
 * @version 2023/11/1 16:03
 */
@Slf4j
@Import(value = CustomConfig.class)
@SpringBootTest(classes = SpringBootTestApplication.class)
public class CustomConfigTest {

    @Resource
    private CustomConfig customConfig;

    @Test
    public void print(){
        log.info("username={}", customConfig.getUsername());
        log.info("age={}", customConfig.getAge());
        log.info("birthday={}", customConfig.getBirthday());
        log.info("secret={}", customConfig.getSecret());
    }
}