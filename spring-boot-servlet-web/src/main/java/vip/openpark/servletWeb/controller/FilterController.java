package vip.openpark.servletWeb.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author anthony
 * @version 2019/7/8 11:02
 */
@RestController
@RequestMapping("filter")
public class FilterController {

	@GetMapping
	public String getString(){
		return "SUCCESS";
	}
}
