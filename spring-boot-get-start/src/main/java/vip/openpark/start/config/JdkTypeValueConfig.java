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
	// spring Date 类型默认解析 yyyy/MM/dd 和 yyyy/MM/dd HH:mm:ss
	@Value("${jdk.type.dateVal2:2023/12/13}")
	private Date dateVal2;
	@Value("${jdk.type.dateVal2:2023/12/13 14:40:00}")
	private Date dateVal3;

	@Value("${jdk.type.localDateTimeVal:}")
	@DateTimeFormat(pattern = "uuuu-MM-dd HH:mm:ss")
	private LocalDateTime localDateTimeVal;
	// spring LocalDateTime 类型默认解析 yyyy-MM-ddTHH:mm:ss
	@Value("${jdk.type.localDateTimeVal2:2023-12-13T14:40:01}")
	private LocalDateTime localDateTimeVal2;

	@Value("${jdk.type.localDateVal:}")
	private LocalDate localDateVal;
	// spring LocalDate 类型默认解析 yyyy-MM-dd
	@Value("${jdk.type.localDateVal2:2023-12-13}")
	private LocalDate localDateVal2;

	@Value("${jdk.type.localTimeVal:}")
	private LocalTime localTimeVal;
	// spring LocalDate 类型默认解析 HH:mm:ss
	@Value("${jdk.type.localTimeVal2:14:40:02}")
	private LocalTime localTimeVal2;
}