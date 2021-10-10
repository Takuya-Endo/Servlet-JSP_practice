package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Exercise_5_2Servlet")
public class Exercise_5_2Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		request.setCharacterEncoding("UTF-8");
		String name = request.getParameter("name");
		String qtype = request.getParameter("qtype");
		String body = request.getParameter("body");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"UTF-8\">");
		out.println("<title>お問い合わせ受付確認</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>お問い合わせ受付確認</h1>");
		out.println("<p>下記の通りお問い合わせを受け付けました。</p>");
		out.println("<p>お名前：<br>");
		out.println(name + "</p>");
		out.println("<p>お問い合わせの種類：<br>");
		out.println(qtype + "</p>");
		out.println("<p>お問い合わせ内容：<br>");
		out.println(body + "</p>");
		out.println("</body>");
		out.println("</html>");
		
	}

}
