package vip.openpark.servletWeb.listener;

import jakarta.servlet.ServletRequestEvent;
import jakarta.servlet.ServletRequestListener;
import jakarta.servlet.annotation.WebListener;

/**
 * @author anthony
 * @version 2019/7/9 7:53
 */
@WebListener
public class MyServletRequestListener implements ServletRequestListener {

	@Override
	public void requestInitialized(ServletRequestEvent sre) {
		System.out.println("requestInitialized");
	}

	@Override
	public void requestDestroyed(ServletRequestEvent sre) {
		System.out.println("requestDestroyed");
	}
}
