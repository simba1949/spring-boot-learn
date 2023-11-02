package vip.openpark.test.controller;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.autoconfigure.actuate.observability.AutoConfigureObservability;
import org.springframework.boot.test.context.SpringBootTest;

import javax.management.MBeanServer;

/**
 * @author anthony
 * @version 2023/11/2 10:44
 */
@Slf4j
@AutoConfigureObservability
@SpringBootTest(properties = "spring.jmx.enabled=true") // 测试时，启用 JMX
public class EnableJmxTest {

    /**
     * 通过注入的 MBeanServer 访问
     */
    @Resource
    private MBeanServer mBeanServer;

    @Test
    public void jmxTest() {
        Assertions.assertThat(this.mBeanServer.getDomains()).contains("java.lang");
    }
}