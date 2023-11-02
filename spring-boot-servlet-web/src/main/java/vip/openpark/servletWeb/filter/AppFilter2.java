package vip.openpark.servletWeb.filter;

import jakarta.servlet.annotation.WebFilter;
import org.springframework.core.annotation.Order;

import jakarta.servlet.*;
import java.io.IOException;

/**
 * @author anthony
 * @version 2019/7/8 11:05
 */
@Order(3)
@WebFilter(urlPatterns = "/filter/*", filterName = "appFilter2")
public class AppFilter2 implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("AppFilter2");
		chain.doFilter(request, response);
	}
}
