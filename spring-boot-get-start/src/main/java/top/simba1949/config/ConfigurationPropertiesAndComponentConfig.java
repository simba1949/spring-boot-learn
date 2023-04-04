package top.simba1949.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotBlank;

/**
 * @author anthony
 * @date 2023/4/3
 */
@Validated
@Data
@Component
@ConfigurationProperties(prefix = "stochastic.component")
public class ConfigurationPropertiesAndComponentConfig {

    @NotBlank
    private String strVal;

    private Integer intVal;

    private String longVal;

    private String uuidVal;

    private Integer lessOrEqualVal;

    private Integer rangeVal;
}
