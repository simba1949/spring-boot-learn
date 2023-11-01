package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 10:17
 */
@Slf4j
@SpringBootTest
public class StochasticEnableConfigTest {

    @Resource
    private StochasticEnableConfig stochasticEnableConfig;

    @Test
    public void print(){
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机字符串={}", stochasticEnableConfig.getStrVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int={}", stochasticEnableConfig.getIntVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机long={}", stochasticEnableConfig.getLongVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机uuid={}", stochasticEnableConfig.getUuidVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int，设置最大取值={}", stochasticEnableConfig.getLessOrEqualVal());
        log.info("ConfigurationPropertiesAndEnableConfig 读取数据，随机int，设置取值范围={}", stochasticEnableConfig.getRangeVal());
    }
}