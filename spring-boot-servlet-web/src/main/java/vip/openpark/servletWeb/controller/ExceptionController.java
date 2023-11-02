package vip.openpark.servletWeb.controller;

import org.springframework.web.bind.annotation.*;

import java.io.IOException;

/**
 * @author anthony
 * @version 2019/7/8 10:32
 */
@RestController
@RequestMapping("e")
public class ExceptionController {

	@GetMapping("")
	public String exception() throws Exception {
		System.out.println("Exception");
		throw new Exception("Exception");
	}

	@GetMapping("io")
	public String ioException() throws IOException {
		System.out.println("IOException");
		throw new IOException("IOException");
	}
}
