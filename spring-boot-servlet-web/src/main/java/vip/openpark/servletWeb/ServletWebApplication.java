package vip.openpark.servletWeb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

/**
 *
 * 注解 @ServletComponentScan 需要扫描 servlet、 filter、 listener 三大组件
 *
 * @author anthony
 * @version 2019/7/8 9:24
 */
@SpringBootApplication
@ServletComponentScan
public class ServletWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServletWebApplication.class, args);
	}
}
