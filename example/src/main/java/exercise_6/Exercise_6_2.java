package exercise_6;

import java.io.IOException;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Exercise_6_2
 */
@WebServlet("/Exercise_6_2")
public class Exercise_6_2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int number = new Random().nextInt(10);
		
		if (number % 2 == 0) {
			
			RequestDispatcher dispatcher = request.getRequestDispatcher("/WebContent/forward.jsp");
			dispatcher.forward(request, response);
			
		} else {
			
			response.sendRedirect("WebContent/redirect.jsp");
			
		}
		
	}

}
