package vip.openpark.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.availability.AvailabilityChangeEvent;
import org.springframework.boot.availability.LivenessState;
import org.springframework.context.ApplicationListener;

/**
 * @author anthony
 * @version 2023/10/31 20:28
 */
@Slf4j
public class AvailabilityChangeEventLivenessStateListener implements ApplicationListener<AvailabilityChangeEvent<LivenessState>> {
    @Override
    public void onApplicationEvent(AvailabilityChangeEvent<LivenessState> event) {
        log.info("6.应用程序处于激活状态");
    }
}