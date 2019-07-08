package top.simba1949.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @ControllerAdvice 全局异常统一处理类标识
 *
 * @author SIMBA1949
 * @date 2019/7/8 10:22
 */
@ControllerAdvice
public class GlobalException {
	/**
	 * @ExceptionHandler(value = IOException.class) 指定处理哪类异常
	 * @param e
	 * @return
	 */
	@ResponseBody
	@ExceptionHandler(value = IOException.class)
	public String ioExceptionDealWith(IOException e){
		System.out.println(e.getMessage());
		return e.getMessage();
	}

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public String exceptionDealWith(Exception e){
		System.out.println(e.getMessage());
		return e.getMessage();
	}
}