package web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UseBeanServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		//インスタンス化
		EmpBean bean = new EmpBean();
		//EmpBeanクラスのsetNameメソッドに値をセットしてる
		bean.setName("山本　拓樹");
		//EmpBeanクラスのsetAgeメソッドに値をセットしてる
		bean.setAge(20);
		//リクエストオブジェクトにぶち込んでる（keyがemp,valueがbeanの中身）
		request.setAttribute("emp", bean);
		//RequestDispatcherを用いて、遷移先を指定している。
		RequestDispatcher rd = request.getRequestDispatcher("useBean.jsp");
		//RequestDispatcherを用いてrequestとresponseの中身をふっ飛ばしてる。
		rd.forward(request, response);

	}

}
