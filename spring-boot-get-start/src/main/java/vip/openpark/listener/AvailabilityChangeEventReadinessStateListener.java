package vip.openpark.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.ReadinessState;
import org.springframework.context.ApplicationListener;

/**
 * @author anthony
 * @version 2023/10/31 20:29
 */
@Slf4j
public class AvailabilityChangeEventReadinessStateListener implements ApplicationListener<AvailabilityChangeEvent<ReadinessState>> {
    @Override
    public void onApplicationEvent(AvailabilityChangeEvent<ReadinessState> event) {
        log.info("8.应用程序已准备好为请求提供服务");
    }
}