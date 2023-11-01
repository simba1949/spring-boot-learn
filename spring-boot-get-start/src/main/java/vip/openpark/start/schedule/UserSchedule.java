package vip.openpark.start.schedule;

import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author anthony
 * @version 2023/4/4
 */
@Slf4j
@Component
public class UserSchedule {

    /**
     * 秒 分 时 月份中的日 月 周中的日
     */
     @Scheduled(cron = "* * * * * *")
    public void run(){
        log.info("The schedule is run");
    }
}