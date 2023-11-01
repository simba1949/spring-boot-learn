package vip.openpark.start;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.scheduling.annotation.EnableScheduling;
import vip.openpark.start.config.StochasticEnableConfig;

/**
 * @author anthony
 * @version 2019/7/7 13:23
 */
@EnableScheduling
@ConfigurationPropertiesScan
@EnableConfigurationProperties(value = {StochasticEnableConfig.class})
@SpringBootApplication
public class SpringBootGetStartApplication {
    public static void main(String[] args) {
        new SpringApplication(SpringBootGetStartApplication.class).run(args);
    }
}