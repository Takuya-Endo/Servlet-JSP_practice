package exercise_7;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet7")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit fruit = new Fruit("いちご", 700);
		request.setAttribute("fruit", fruit);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/exercise_7/fruit.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
