package top.simba1949.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIMBA1949
 * @date 2019/7/8 11:02
 */
@RestController
@RequestMapping("filter")
public class FilterController {

	@GetMapping
	public String getString(){
		return "SUCCESS";
	}
}
