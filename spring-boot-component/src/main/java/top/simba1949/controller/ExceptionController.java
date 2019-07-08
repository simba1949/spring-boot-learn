package top.simba1949.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

/**
 * @author SIMBA1949
 * @date 2019/7/8 10:32
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
