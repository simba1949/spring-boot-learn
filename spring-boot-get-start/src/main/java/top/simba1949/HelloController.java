package top.simba1949;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author SIMBA1949
 * @date 2019/7/7 13:47
 */
@RestController
@RequestMapping("hello")
public class HelloController {

	@Value("${my.secret}")
	private String secret;
	@Value("${my.number}")
	private int number;
	@Value("${my.bigNumber}")
	private long bigNumber;
	@Value("${my.uuid}")
	private String uuid;
	@Value("${my.number.less.than.ten}")
	private int numberLessThanTen;
	@Value("${my.number.in.range}")
	private int numberInRange;

	@GetMapping
	public String sayHello(String name){
		StringBuilder sb = new StringBuilder();
		sb.append("secret=" + secret).append("\tnumber=" + number)
				.append("\tbigNumber=" + bigNumber)
				.append("\tuuid=" + uuid)
				.append("\tnumberLessThanTen=" + numberLessThanTen)
				.append("\tnumberInRange=" + numberInRange);
		System.out.println(sb.toString());
		return "Hello " + name;
	}
}
