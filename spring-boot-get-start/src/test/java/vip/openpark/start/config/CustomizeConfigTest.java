package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 10:18
 */
@Slf4j
@SpringBootTest
public class CustomizeConfigTest {

    @Resource
    private CustomizeConfig customizeConfig;

    @Test
    public void print(){
        log.info("CustomizePropertiesConfig 读取数据， username={}", customizeConfig.getUsername());
        log.info("CustomizePropertiesConfig 读取数据， age={}", customizeConfig.getAge());
        log.info("CustomizePropertiesConfig 读取数据， birthday={}", customizeConfig.getBirthday());
        log.info("CustomizePropertiesConfig 读取数据， secret={}", customizeConfig.getSecret());
    }
}