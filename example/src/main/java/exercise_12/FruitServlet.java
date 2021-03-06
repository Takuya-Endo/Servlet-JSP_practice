package exercise_12;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/FruitServlet12")
public class FruitServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Fruit fruit = new Fruit("ใใกใ", 700);
		
		ServletContext servletContext = this.getServletContext();
		servletContext.setAttribute("fruit", fruit);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/exercise_12/fruit.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
