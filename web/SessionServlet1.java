package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class SessionServlet1 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) //doGetメソッドのオーバーライド
			throws ServletException, IOException {
			HttpSession session = request.getSession(true); //セッション開始true
			session.setAttribute("loginUser", "YamamotoHiroki"); //UserNameの設定
			response.setContentType("text/html;charset=Windows-31J");
			PrintWriter out = response.getWriter(); //htmlの有効化
			out.println("<html>");
			out.println("<head><title>Session Servlet 1</title></head>");
			out.println("<body>");
			out.println("<h1>Session Servlet 1</h1>");
			out.println("<p>セッションを開始しました</p>");
			out.println("</body>");
			out.println("</html>");
			}
}
