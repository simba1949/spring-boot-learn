package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 10:14
 */
@Slf4j
@SpringBootTest
public class StochasticConfigTest {

    @Resource
    private StochasticConfig stochasticConfig;

    @Test
    public void print(){
        log.info("ConfigurationConfig 读取数据，随机字符串={}", stochasticConfig.getStrVal());
        log.info("ConfigurationConfig 读取数据，随机int={}", stochasticConfig.getIntVal());
        log.info("ConfigurationConfig 读取数据，随机long={}", stochasticConfig.getLongVal());
        log.info("ConfigurationConfig 读取数据，随机uuid={}", stochasticConfig.getUuidVal());
        log.info("ConfigurationConfig 读取数据，随机int，设置最大取值={}", stochasticConfig.getLessOrEqualVal());
        log.info("ConfigurationConfig 读取数据，随机int，设置取值范围={}", stochasticConfig.getRangeVal());
    }
}
