package top.simba1949.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 *
 * @WebServlet(urlPatterns = {"/my", "/diy"}, name = "diyServlet") urlPatterns 设置访问路径，name 设置 servlet 名称
 *
 * @author SIMBA1949
 * @date 2019/7/9 6:34
 */
@WebServlet(urlPatterns = {"/my", "/diy"}, name = "diyServlet")
public class MyServlet extends HttpServlet {
	private static final long serialVersionUID = -6473768022688770593L;

	/**
	 * 自定义 servlet 的 doGet 请求
	 * @param req
	 * @param resp
	 * @throws ServletException
	 * @throws IOException
	 */
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("接收到请求");
		resp.setCharacterEncoding("utf-8");
		resp.getWriter().append("君不见黄河之水天上来");
	}
}
