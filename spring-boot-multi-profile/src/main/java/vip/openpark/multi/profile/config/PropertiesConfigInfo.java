package vip.openpark.multi.profile.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.io.Serializable;

/**
 * 使用 @ConfigurationProperties(prefix = "user") 指定前缀，并提供 setter 方法
 *
 * @author anthony
 * @version 2019/7/7 22:00
 */
@Configuration
@ConfigurationProperties(prefix = "user")
public class PropertiesConfigInfo implements Serializable {

	private static final long serialVersionUID = -467150486910074559L;
	private String username;
	private String say;

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSay() {
		return say;
	}

	public void setSay(String say) {
		this.say = say;
	}

	@Override
	public String toString() {
		return "PropertiesConfigInfo{" +
				"username='" + username + '\'' +
				", say='" + say + '\'' +
				'}';
	}
}
