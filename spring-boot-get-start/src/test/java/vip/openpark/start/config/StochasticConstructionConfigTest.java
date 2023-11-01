package vip.openpark.start.config;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

/**
 * @author anthony
 * @version 2023/11/1 13:35
 */
@Slf4j
@SpringBootTest
public class StochasticConstructionConfigTest {

    @Resource
    private StochasticConstructionConfig stochasticConstructionConfig;

    @Test
    public void print(){
        log.info("strVal={}", stochasticConstructionConfig.getStrVal());
    }
}
