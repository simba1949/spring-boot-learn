package vip.openpark.test.config;

import com.alibaba.fastjson2.JSON;
import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;
import java.util.Set;

/**
 * @author anthony
 * @version 2023/11/1 16:25
 */
@Slf4j
@SpringBootTest(args = {"--app.key=1234", "--app.secret=abcd", "--app.name=unit-test"})
public class ArgsTest {

    @Resource
    private ApplicationArguments applicationArguments;

    @Test
    public void print() {
        // 获取所有参数名
        Set<String> optionNames = applicationArguments.getOptionNames();
        log.info("The name of all args is {}", JSON.toJSONString(optionNames));

        // 是否包含某个参数
        boolean flag = applicationArguments.containsOption("app.secret");
        log.info("是否包含 {}", flag);

        // 获取某个参数的值，值都为 list
        List<String> optionValues = applicationArguments.getOptionValues("app.secret");
        log.info("app.secret value {}", JSON.toJSONString(optionValues));
    }
}