package vip.openpark.multi.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import vip.openpark.multi.profile.config.OtherPropertiesConfig;
import vip.openpark.multi.profile.config.PropertiesConfigInfo;

/**
 * @author anthony
 * @version 2019/7/7 22:00
 */
@RestController
@RequestMapping("hello")
public class HelloController {
	/**
	 * 注入进来的 info 是 Spring CGLib 动态代理生成的类，不是项目中定义的类，但是可以获取配置中的信息
	 */
	@Autowired
	private PropertiesConfigInfo info;

	@GetMapping
	public PropertiesConfigInfo getInfo(){
		System.out.println(info.toString());
		System.out.println(info.getClass().getName());
		PropertiesConfigInfo configInfo = new PropertiesConfigInfo();
		configInfo.setUsername(info.getUsername());
		configInfo.setSay(info.getSay());

		return configInfo;
	}

	@Autowired
	private OtherPropertiesConfig config;

	@GetMapping("config")
	public String config(){
		System.out.println(config.toString());
		System.out.println(config.getClass().getName());
		return "SUCCESS";
	}
}
