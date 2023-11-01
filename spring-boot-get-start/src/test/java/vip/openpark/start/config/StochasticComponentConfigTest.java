package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 10:16
 */
@Slf4j
@SpringBootTest
public class StochasticComponentConfigTest {

    @Resource
    private StochasticComponentConfig stochasticComponentConfig;

    @Test
    public void print(){
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机字符串={}", stochasticComponentConfig.getStrVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int={}", stochasticComponentConfig.getIntVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机long={}", stochasticComponentConfig.getLongVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机uuid={}", stochasticComponentConfig.getUuidVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int，设置最大取值={}", stochasticComponentConfig.getLessOrEqualVal());
        log.info("ConfigurationPropertiesAndComponentConfig 读取数据，随机int，设置取值范围={}", stochasticComponentConfig.getRangeVal());
    }
}
