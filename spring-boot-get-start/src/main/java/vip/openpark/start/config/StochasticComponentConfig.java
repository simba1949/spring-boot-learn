package vip.openpark.start.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author anthony
 * @version 2023/4/3
 */
@Data
@Component
@ConfigurationProperties(prefix = "stochastic.component")
public class StochasticComponentConfig {

    private String strVal;

    private Integer intVal;

    private String longVal;

    private String uuidVal;

    private Integer lessOrEqualVal;

    private Integer rangeVal;
}