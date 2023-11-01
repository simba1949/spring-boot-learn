package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 10:39
 */
@Slf4j
@SpringBootTest
public class StochasticComponentValidateConfigTest {

    @Resource
    private StochasticComponentValidateConfig stochasticComponentValidateConfig;

    @Test
    public void validate(){
        log.info("字符串={}", stochasticComponentValidateConfig.getStrVal());
        log.info("INT={}", stochasticComponentValidateConfig.getIntVal());
    }
}
