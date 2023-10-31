//package vip.openpark.listener;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.boot.availability.AvailabilityChangeEvent;
//import org.springframework.boot.availability.LivenessState;
//import org.springframework.boot.availability.ReadinessState;
//import org.springframework.boot.context.event.*;
//import org.springframework.context.event.EventListener;
//import org.springframework.stereotype.Component;
//
///**
// * <div>
// *     直接放开注释即可监听对应的事件
// * </div>
// * <div>
// *     使用 Bean 的方式无法监听
// *     1.applicationStartingEvent；
// *     2.applicationEnvironmentPreparedEvent；
// *     3.applicationContextInitializedEvent；
// *     4.applicationPreparedEvent
// * </div>
// * <div>
// *     可以监听以下事件
// *     5.applicationStartedEvent
// *     6.AvailabilityChangeEvent<LivenessState>
// *     7.ApplicationReadyEvent
// *     8.AvailabilityChangeEvent<ReadinessState>
// * </div>
// *
// * @author anthony
// * @version 2023/10/31 17:34
// */
//@Slf4j
//@Component
//public class SpringContextListener {
//
//    @EventListener(classes = ApplicationStartingEvent.class)
//    public void applicationStartingEvent(ApplicationStartingEvent event) {
//        log.info("1.监听器和初始化程序已启动");
//    }
//
//    @EventListener(classes = ApplicationEnvironmentPreparedEvent.class)
//    public void applicationEnvironmentPreparedEvent(ApplicationEnvironmentPreparedEvent event) {
//        log.info("2.环境准就绪，spring 容器即将初始化");
//    }
//
//    @EventListener(classes = ApplicationContextInitializedEvent.class)
//    public void applicationContextInitializedEvent(ApplicationContextInitializedEvent event) {
//        log.info("3.spring 容器初始化完成，即将加载 bean");
//    }
//
//    @EventListener(classes = ApplicationPreparedEvent.class)
//    public void applicationPreparedEvent(ApplicationPreparedEvent event) {
//        log.info("4.bean已经初始化完成");
//    }
//
//    //==================使用 Bean 的方式无法监听以上事件=====================
//
//    @EventListener(classes = ApplicationStartedEvent.class)
//    public void applicationStartedEvent(ApplicationStartedEvent event) {
//        log.info("5.spring 容器已经刷新，但 command-line 还未执行");
//    }
//
//    @EventListener(classes = AvailabilityChangeEvent.class)
//    public void availabilityChangeEvent4LivenessState(AvailabilityChangeEvent<LivenessState> event) {
//        log.info("6.应用程序处于激活状态");
//    }
//
//    @EventListener(classes = ApplicationReadyEvent.class)
//    public void applicationReadyEvent(ApplicationReadyEvent event) {
//        log.info("7.command-line 执行完成");
//    }
//
//
//    @EventListener(classes = AvailabilityChangeEvent.class)
//    public void availabilityChangeEvent4ReadinessState(AvailabilityChangeEvent<ReadinessState> event) {
//        log.info("8.应用程序已准备好为请求提供服务");
//    }
//
//    @EventListener(classes = ApplicationFailedEvent.class)
//    public void applicationFailedEvent(ApplicationFailedEvent event) {
//        log.info("应用启动异常");
//    }
//}