package top.simba1949.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIMBA1949
 * @date 2019/7/7 13:47
 */
@RestController
@RequestMapping
public class HelloController {

	@GetMapping("hello")
	public String sayHello(){
		return "Hello World!";
	}
}
