package vip.openpark.filter;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

import java.io.IOException;

/**
 * @Order(2) 配置多个过滤器的执行顺序，数值越小的过滤器优先执行
 * @WebFilter(urlPatterns = "/filter/*", filterName = "appFilter") 配置拦截 url
 * urlPatterns 配置规则只能使用一个 * ，否则会失效
 *
 * @author anthony
 * @version 2019/7/8 10:49
 */
@Order(2)
@WebFilter(urlPatterns = "/filter/*", filterName = "appFilter")
public class AppFilter implements Filter {
	/**
	 * 过滤器逻辑
	 * @param request
	 * @param response
	 * @param chain
	 * @throws IOException
	 * @throws ServletException
	 */
	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("AppFilter");
		chain.doFilter(request, response);
	}
}