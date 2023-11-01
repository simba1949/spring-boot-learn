package vip.openpark.start.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author anthony
 * @version 2023/11/1 13:59
 */
@Data
@ConfigurationProperties(prefix = "jdk.type.configuration")
public class JdkTypeConfigurationConfig {

    private List<String> listVal;

    private Set<Integer> setVal;

    private Map<String, String> mapVal;
}