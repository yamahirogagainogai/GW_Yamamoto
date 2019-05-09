package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class FirstServlet extends HttpServlet {

	// dogetと入力後Ctrl+Spaceキーを入力
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// エンコーディングとMIMEタイプの設定
		resp.setContentType("text/html;charset = UTF-8");
		// ServletでHTMLを書くための準備をしている
		PrintWriter out = resp.getWriter();
		// 変数名.の形式でHTMLが書けるよ！
		out.println("<html>");
		out.println("<head><title>サンプルページ</title></head>");
		out.println("<body>");
		out.println("<h1>HelloWorld</h1>");
		out.println("<p>やっほー</p>");
		out.println("</body>");
		out.println("</html>");
		// HTMLをCLOSEで閉じますよ
		out.close();
	}

}
