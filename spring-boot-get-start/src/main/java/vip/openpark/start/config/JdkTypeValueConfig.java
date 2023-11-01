package vip.openpark.start.config;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.format.annotation.DateTimeFormat;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * @author anthony
 * @version 2023/11/1 11:09
 */
@Data
@Configuration
public class JdkTypeValueConfig {

    @Value("${jdk.type.bigDecimalVal:}")
    private BigDecimal bigDecimalVal;


    @Value("${jdk.type.listVal:}")
    private List<String> listVal;

    // List 指定分隔符
    @Value("#{'${jdk.type.listVal2:}'.split(';')}")
    private List<String> list2Val;

    @Value("${jdk.type.setVal:}")
    private Set<Integer> setVal;

    @Value("#{${jdk.type.mapVal:}}")
    private Map<String, String> mapVal;


    /**
     * date 使用 yyyy-MM-dd HH:mm:ss
     */
    @Value("${jdk.type.dateVal:}")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date dateVal;

    @Value("${jdk.type.localDateTimeVal:}")
    @DateTimeFormat(pattern = "uuuu-MM-dd HH:mm:ss")
    private LocalDateTime localDateTimeVal;

    @Value("${jdk.type.localDateVal:}")
    private LocalDate localDateVal;

    @Value("${jdk.type.localTimeVal:}")
    private LocalTime localTimeVal;
}