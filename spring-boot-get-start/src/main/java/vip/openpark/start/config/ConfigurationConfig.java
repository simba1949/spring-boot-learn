package vip.openpark.start.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;

/**
 * @author anthony
 * @version 2023/4/3
 */
@Data
@Configuration
public class ConfigurationConfig {

    @Value("${stochastic.strVal}")
    private String strVal;

    @Value(("${stochastic.intVal}"))
    private Integer intVal;

    @Value("${stochastic.longVal}")
    private String longVal;

    @Value("${stochastic.uuidVal}")
    private String uuidVal;

    @Value("${stochastic.lessOrEqualVal}")
    private Integer lessOrEqualVal;

    @Value("${stochastic.rangeVal}")
    private Integer rangeVal;
}
