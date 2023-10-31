package vip.openpark.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIMBA1949
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
