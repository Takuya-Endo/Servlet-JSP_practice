package servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		
		
		ServletContext servletContext = this.getServletContext();
		
		
		if (Objects.isNull(action)) {
			
		} else if ("like".equalsIgnoreCase(action)) {
			
		} else if ("dislike".equalsIgnoreCase(action)) {
			
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp");
		requestDispatcher.forward(request, response);
		
		//request.setAttribute("text", text);
		//RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp");
		//requestDispatcher.forward(request, response);
		
		//request.setAttribute("text", text);
		//ServletContext servletContext = super.getServletContext();
		//RequestDispatcher requestDispatcher = servletContext.getRequestDispatcher("/WEB-INF/jsp/minatoIndex.jsp");
		//requestDispatcher.forward(request, response);
		
	}
	
}
