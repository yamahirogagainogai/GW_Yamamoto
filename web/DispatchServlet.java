package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class DispatchServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
			HttpSession session = request.getSession(true); //セッション開始true
			session.setAttribute("name", "たかお"); //nameの設定
			request.setAttribute("age",new Integer(20)); //ageの設定
			RequestDispatcher rd = request.getRequestDispatcher("/test.jsp"); //ページの呼び出し
			rd.forward(request, response);
			}

}
