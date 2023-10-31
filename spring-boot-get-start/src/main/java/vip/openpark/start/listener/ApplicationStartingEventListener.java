package vip.openpark.start.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

/**
 * @author anthony
 * @version 2023/10/31 20:19
 */
@Slf4j
public class ApplicationStartingEventListener implements ApplicationListener<ApplicationStartingEvent> {
    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        // 1.执行了，但是没有打印日志
        log.info("1.监听器和初始化程序已启动");
    }
}