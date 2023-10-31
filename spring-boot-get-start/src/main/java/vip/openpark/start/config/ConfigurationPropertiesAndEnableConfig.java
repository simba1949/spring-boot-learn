package vip.openpark.start.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anthony
 * @version 2023/4/3
 */
@Data
@ConfigurationProperties(prefix = "stochastic.enable")
public class ConfigurationPropertiesAndEnableConfig {
    private String strVal;

    private Integer intVal;

    private String longVal;

    private String uuidVal;

    private Integer lessOrEqualVal;

    private Integer rangeVal;
}
