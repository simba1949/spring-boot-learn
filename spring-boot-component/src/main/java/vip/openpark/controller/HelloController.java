package vip.openpark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2019/7/8 9:25
 */
@RestController
@RequestMapping("hello")
public class HelloController {

	@GetMapping("say")
	public String say(String name){
		return "Hello " + name;
	}
}
