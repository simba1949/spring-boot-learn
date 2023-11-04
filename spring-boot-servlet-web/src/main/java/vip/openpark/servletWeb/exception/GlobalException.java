package vip.openpark.servletWeb.exception;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @ControllerAdvice 全局异常统一处理类标识，也可以指定类或者包
 *
 * @author anthony
 * @version 2019/7/8 10:22
 */
@Slf4j
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
		log.info("捕捉到IO异常，异常信息：{}", e.getMessage(), e);
		return e.getMessage();
	}

	@ResponseBody
	@ExceptionHandler(value = Exception.class)
	public String exceptionDealWith(Exception e){
		log.info("捕捉到除IO异常之外的异常，异常信息：{}", e.getMessage(), e);
		return e.getMessage();
	}
}