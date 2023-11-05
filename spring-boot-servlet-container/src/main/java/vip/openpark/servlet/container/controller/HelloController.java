package vip.openpark.servlet.container.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2019/7/9 8:40
 */
@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping
	public String say(){
		return "SUCCESS";
	}
}