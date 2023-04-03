package top.simba1949.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author anthony
 * @date 2023/4/3
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
