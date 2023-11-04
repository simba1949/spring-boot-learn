package vip.openpark.servletWeb.exception;

import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorViewResolver;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.ModelAndView;

import java.util.Map;

/**
 * @author anthony
 * @version 2023/11/4 15:48
 */
@Slf4j
//@Component
public class MyErrorViewResolver implements ErrorViewResolver {
    @Override
    public ModelAndView resolveErrorView(HttpServletRequest request, HttpStatus status, Map<String, Object> model) {
        log.info("进入自定义异常视图解析器");
        // Use the request or status to optionally return a ModelAndView
        if (status == HttpStatus.NOT_FOUND) {
            // We could add custom model values here
            return new ModelAndView("error/my404.html");
        }
        return null;
    }
}