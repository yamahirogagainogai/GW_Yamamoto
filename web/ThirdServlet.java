package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ThirdServlet extends HttpServlet {
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
				throws ServletException, IOException{
		//送信され手来るパラーメータのエンコーディングの指定
		req.setCharacterEncoding("UTF-8");
		//送信したパラメータの取得(文字列)
		String name =req.getParameter("name");
		String age = req.getParameter("select");
		String sex =req.getParameter("sex");
		String langage1 = req.getParameter("jl");
		String langage2 = req.getParameter("pl");
		String langage3 = req.getParameter("cl");
		String msg =req.getParameter("param1");
		//以下、HTML形式で出力されるためのコード
		resp.setContentType("text/html;charset = UTF-8");
		PrintWriter out = resp.getWriter();

		// 変数名.の形式でHTMLが書けるよ！
				out.println("<html>");
				out.println("<head>");
				out.println("<body>");
				out.print("<h1>お名前：</h1>"); //HTMLとJavaのコードを組み合わせている
				out.println("<p>"+name+"</p>");
				out.print("<h1>年齢：</h1>"); //HTMLとJavaのコードを組み合わせている
				out.println("<p>"+age+"代</p>");
				out.print("<h1>性別：</h1>"); //HTMLとJavaのコードを組み合わせている
				out.println("<p>"+sex+"代</p>");
				out.print("<h1>興味のある言語：</h1>"); //HTMLとJavaのコードを組み合わせている
				if(langage1.equals(null) && langage1!="") {
					out.println(langage1);
				}
				if(langage2.equals(null) && langage2!="") {
					out.println(langage2);
				}
				if(langage3.equals(null) && langage3!="") {
					out.println(langage3);
				}
				out.print("<h1>何か一言：</h1>"); //HTMLとJavaのコードを組み合わせている
				out.println(msg);
				out.println("</body>");
				out.println("</head");
				out.println("</html>");
				// HTMLをCLOSEで閉じますよ
				out.close();
	}
}
