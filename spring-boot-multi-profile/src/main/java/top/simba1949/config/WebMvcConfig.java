package top.simba1949.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @author SIMBA1949
 * @date 2019/7/8 9:15
 */
@Configuration
public class WebMvcConfig implements WebMvcConfigurer {
	/**
	 * 添加静态资源文件，外部可以直接访问地址
	 * @param registry
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		//需要配置1：----------- 需要告知系统，这是要被当成静态文件的！
		//第一个方法设置访问路径前缀，第二个方法设置资源路径
		registry.addResourceHandler("/static/**").addResourceLocations("classpath:/static/");
		registry.addResourceHandler("/templates/**").addResourceLocations("classpath:/templates/");
		registry.addResourceHandler("/upload/**").addResourceLocations("classpath:/upload/");
	}
}
