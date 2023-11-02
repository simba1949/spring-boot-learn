package vip.openpark.servletWeb.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.core.convert.converter.Converter;

import java.time.LocalDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

/**
 * @author anthony
 * @version 2023/11/2 13:35
 */
@Slf4j
public class DateTimeStrToTimestampConverter implements Converter<String, Long> {

    @Override
    public Long convert(String source) {
        log.info("自定义配置文件解析服务");

        if (null == source || source.isBlank()) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm:ss");
        LocalDateTime localDateTime = LocalDateTime.parse(source, formatter);
        return localDateTime.toInstant(ZoneOffset.ofHours(8)).toEpochMilli();
    }
}