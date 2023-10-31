package vip.openpark.start.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

/**
 * @author anthony
 * @version 2023/4/3
 */
@Data
@Configuration
@PropertySource(value = "classpath:author.properties")
public class CustomizePropertiesConfig {

    @Value("${username}")
    private String username;

    @Value("${age}")
    private Integer age;

    @Value("${birthday}")
    private Date birthday;

    @Value("${secret}")
    private String secret;
}
