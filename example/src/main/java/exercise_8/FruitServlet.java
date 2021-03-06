package exercise_8;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class FruitServlet
 */
@WebServlet("/FruitServlet8")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit fruit = new Fruit("ใใกใ", 700);
		
		HttpSession httpSession = request.getSession(false);
		httpSession.setAttribute("fruit", fruit);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/exercise_8/fruit.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
