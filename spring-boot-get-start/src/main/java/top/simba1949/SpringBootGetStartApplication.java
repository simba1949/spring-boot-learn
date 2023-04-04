package top.simba1949;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import top.simba1949.config.ConfigurationPropertiesAndEnableConfig;

/**
 * @author SIMBA1949
 * @date 2019/7/7 13:23
 */
@EnableConfigurationProperties(value = {ConfigurationPropertiesAndEnableConfig.class})
@SpringBootApplication
public class SpringBootGetStartApplication {
	public static void main(String[] args) {
		SpringApplication application = new SpringApplication(SpringBootGetStartApplication.class);
		application.setBannerMode(Banner.Mode.OFF); // 关闭 Banner
		application.run(args);
	}

//	public static void main(String[] args) {
//		new SpringApplicationBuilder()
//				.sources(SpringBootGetStartApplication.class) // 项目中的启动类
//				.bannerMode(Banner.Mode.OFF)
//				.run(args);
//	}

}
