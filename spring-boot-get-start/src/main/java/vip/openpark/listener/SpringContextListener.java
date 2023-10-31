package vip.openpark.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.AvailabilityState;
import org.springframework.boot.availability.LivenessState;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.boot.context.event.*;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author anthony
 * @version 2023/10/31 17:34
 */
@Slf4j
@Component
public class SpringContextListener {

    @EventListener(classes = ApplicationStartingEvent.class)
    public void applicationStartingEvent(ApplicationStartingEvent event) {
        log.info("监听器和初始化程序已启动");
    }

    @EventListener(classes = ApplicationEnvironmentPreparedEvent.class)
    public void applicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent event) {
        log.info("环境准就绪");
    }

    @EventListener(classes = ApplicationContextInitializedEvent.class)
    public void applicationContextInitializedEvent(ApplicationContextInitializedEvent event) {
        log.info("spring 容器初始化完成");
    }

    @EventListener(classes = ApplicationPreparedEvent.class)
    public void applicationPreparedEvent(ApplicationPreparedEvent event) {
        log.info("bean已经初始化完成");
    }

    @EventListener(classes = ApplicationStartedEvent.class)
    public void applicationStartedEvent(ApplicationStartedEvent event) {
        log.info("spring 容器已经刷新，但 command-line 还未执行");
    }

    @EventListener(classes = AvailabilityChangeEvent.class)
    public void availabilityChangeEvent(AvailabilityChangeEvent event) {
        log.info("应用程序处于激活状态");
        AvailabilityState state = event.getState();
        if (LivenessState.CORRECT == state){
            availabilityChangeEvent_LivenessState(event);
        }
        if (ReadinessState.ACCEPTING_TRAFFIC == state){
            availabilityChangeEvent_ReadinessState(event);
        }
    }

    public void availabilityChangeEvent_LivenessState(AvailabilityChangeEvent event) {
        log.info("应用程序处于激活状态");
    }

    @EventListener(classes = ApplicationReadyEvent.class)
    public void applicationReadyEvent(ApplicationReadyEvent event) {
        log.info("command-line 执行完成");
    }


    public void availabilityChangeEvent_ReadinessState(AvailabilityChangeEvent event) {
        log.info("应用程序已准备好为请求提供服务");
    }

    @EventListener(classes = ApplicationFailedEvent.class)
    public void applicationFailedEvent(ApplicationFailedEvent event) {
        log.info("启动异常");
    }
}
