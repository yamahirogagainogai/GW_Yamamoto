package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class SecondServlet extends HttpServlet {

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException{
		//送信され手来るパラーメータのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得(文字列)
		String ｘ =req.getParameter("param");
		//以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html;charset = UTF-8");
		PrintWriter out = resp.getWriter();

		// 変数名.の形式でHTMLが書けるよ！
				out.println("<html>");
				out.println("<head>");
				out.println("<body>");
				out.println("<h1>"+ｘ+"</h1>"); //HTMLとJavaのコードを組み合わせている
				out.println("</body>");
				out.println("</head");
				out.println("</html>");
				// HTMLをCLOSEで閉じますよ
				out.close();
	}

}
