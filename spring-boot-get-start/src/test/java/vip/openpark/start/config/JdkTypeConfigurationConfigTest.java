package vip.openpark.start.config;

import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 14:03
 */
@Slf4j
@SpringBootTest
public class JdkTypeConfigurationConfigTest {

    @Resource
    private JdkTypeConfigurationConfig jdkTypeConfigurationConfig;

    @Test
    public void print(){
        log.info("listVal={}", JSON.toJSONString(jdkTypeConfigurationConfig.getListVal()));
        log.info("setVal={}", JSON.toJSONString(jdkTypeConfigurationConfig.getSetVal()));
        log.info("mapVal={}", JSON.toJSONString(jdkTypeConfigurationConfig.getMapVal()));
    }
}
