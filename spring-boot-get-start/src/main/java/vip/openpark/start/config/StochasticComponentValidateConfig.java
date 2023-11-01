package vip.openpark.start.config;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;
import org.springframework.validation.annotation.Validated;

/**
 * @author anthony
 * @version 2023/4/3
 */
@Validated
@Data
@Component
@ConfigurationProperties(prefix = "stochastic.component.validated")
public class StochasticComponentValidateConfig {

    @NotBlank(message = "字符串数据不能为空")
    private String strVal;

    @NotNull(message = "数值不能为空")
    private Integer intVal;
}