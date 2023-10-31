package vip.openpark.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import java.util.Date;

/**
 * 使用 @PropertySource(value = "classpath:author.yml") 注解，并指定文件路径，使用 @Value 可以获取配置信息的数据
 *
 * @author SIMBA1949
 * @version 2019/7/7 22:32
 */
@Configuration
@PropertySource(value = "classpath:author.properties")
public class OtherPropertiesConfig {

	@Value("${user.username}")
	private String username;
	@Value("${user.age}")
	private int age;
	@Value("${user.birthday}")
	private Date birthday;
	@Value("${user.flag}")
	private boolean flag;


	@Override
	public String toString() {
		return "OtherPropertiesConfig{" +
				"username='" + username + '\'' +
				", age=" + age +
				", birthday=" + birthday +
				", flag=" + flag +
				'}';
	}
}
