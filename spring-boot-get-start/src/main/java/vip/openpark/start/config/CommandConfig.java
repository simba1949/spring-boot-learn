package vip.openpark.start.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.ApplicationArguments;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author anthony
 * @version 2023/10/31 23:11
 */
@Slf4j
@Component
public class CommandConfig {

    public CommandConfig(ApplicationArguments arguments) {
        // 读取 SpringApplication.run(…) 参数
        List<String> nonOptionArgs = arguments.getNonOptionArgs();
        nonOptionArgs.forEach(ele -> log.info("读取的参数是：{}", ele));
    }
}