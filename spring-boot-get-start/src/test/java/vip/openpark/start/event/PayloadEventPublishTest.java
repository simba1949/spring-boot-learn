package vip.openpark.start.event;

import jakarta.annotation.Resource;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import vip.openpark.start.SpringBootGetStartApplication;

import java.util.concurrent.CountDownLatch;

/**
 * @author anthony
 * @version 2023/10/31 22:39
 */
@Slf4j
@SpringBootTest(classes = SpringBootGetStartApplication.class)
public class PayloadEventPublishTest {

    @Resource
    private EventPublisher eventPublisher;

    @Test
    public void sendEvent(){
        StringEvent stringEvent = new StringEvent("人生得意须尽欢");
        // 发送
        eventPublisher.sendEvent(stringEvent);
    }
}