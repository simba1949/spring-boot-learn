package vip.openpark.start.config;

import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anthony
 * @version 2023/11/1 13:32
 */
@Getter
@ConfigurationProperties(prefix = "stochastic.construction")
public class StochasticConstructionConfig {

    private String strVal;

    public StochasticConstructionConfig(String strVal) {
        this.strVal = strVal;
    }
}