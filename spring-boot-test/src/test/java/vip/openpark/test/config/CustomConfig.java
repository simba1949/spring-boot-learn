package vip.openpark.test.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.format.annotation.DateTimeFormat;

import java.time.LocalDateTime;

/**
 * @author anthony
 * @version 2023/11/1 15:59
 */
@Data
@TestConfiguration
@PropertySource(value = "classpath:author.properties")
public class CustomConfig {

    @Value("${username}")
    private String username;

    @Value("${age}")
    private Integer age;

    @Value("${birthday}")
    @DateTimeFormat(pattern = "uuuu-MM-dd HH:mm:ss")
    private LocalDateTime birthday;

    @Value("${secret}")
    private String secret;
}