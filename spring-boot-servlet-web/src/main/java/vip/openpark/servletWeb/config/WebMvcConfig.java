package vip.openpark.servletWeb.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.format.FormatterRegistry;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import vip.openpark.servletWeb.interceptor.UserInterceptor;

/**
 * @author anthony
 * @version 2019/7/8 9:29
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {

	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		// 注册拦截器，配置拦截器需要拦截的 url
		registry.addInterceptor(new UserInterceptor()).addPathPatterns("/hello/**");
	}

	@Override
	public void addFormatters(FormatterRegistry registry) {
		registry.addConverter(new DateTimeStrToTimestampConverter());
	}
}