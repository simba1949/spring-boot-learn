package vip.openpark.start.event;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author anthony
 * @version 2023/10/31 22:24
 */
@Slf4j
@Component
public class StringEventListener {

    @EventListener(classes = StringEvent.class)
    public void exec(StringEvent stringEvent) {
        log.info("获取到事件信息：{}", stringEvent.getSource());
    }
}