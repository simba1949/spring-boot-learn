package vip.openpark.start.config;

import com.alibaba.fastjson2.JSON;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.format.DateTimeFormatter;

/**
 * @author anthony
 * @version 2023/11/1 11:16
 */
@Slf4j
@SpringBootTest
public class JdkTypeValueConfigTest {

    @Autowired
    private JdkTypeValueConfig jdkTypeValueConfig;

    @Test
    public void print(){
        log.info("BigDecimal={}", JSON.toJSONString(jdkTypeValueConfig.getBigDecimalVal()));


        log.info("List={}", JSON.toJSONString(jdkTypeValueConfig.getListVal()));
        log.info("List2={}", JSON.toJSONString(jdkTypeValueConfig.getList2Val()));

        log.info("Set={}", JSON.toJSONString(jdkTypeValueConfig.getSetVal()));

        log.info("Map={}", JSON.toJSONString(jdkTypeValueConfig.getMapVal()));


        log.info("date={}", jdkTypeValueConfig.getDateVal().toString());
        log.info("date2={}", jdkTypeValueConfig.getDateVal2().toString());
        log.info("date3={}", jdkTypeValueConfig.getDateVal3().toString());

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        log.info("LocalDateTime={}", dateTimeFormatter.format(jdkTypeValueConfig.getLocalDateTimeVal()));
        log.info("LocalDateTime2={}", dateTimeFormatter.format(jdkTypeValueConfig.getLocalDateTimeVal2()));

        DateTimeFormatter dateFormatter = DateTimeFormatter.ofPattern("uuuu-MM-dd");
        log.info("LocalDate={}", dateFormatter.format(jdkTypeValueConfig.getLocalDateVal()));
        log.info("LocalDate2={}", dateFormatter.format(jdkTypeValueConfig.getLocalDateVal2()));

        DateTimeFormatter timeFormatter = DateTimeFormatter.ofPattern("HH:mm:ss");
        log.info("LocalTime={}", timeFormatter.format(jdkTypeValueConfig.getLocalTimeVal()));
        log.info("LocalTime2={}", timeFormatter.format(jdkTypeValueConfig.getLocalTimeVal2()));
    }
}