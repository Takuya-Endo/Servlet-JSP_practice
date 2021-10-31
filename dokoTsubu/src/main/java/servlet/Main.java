package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Mutter;
import model.User;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		ServletContext servletContext = this.getServletContext();
		ArrayList<Mutter> mutterList = (ArrayList<Mutter>) servletContext.getAttribute("mutterList");
		
		if (Objects.isNull(mutterList)) {
			
			mutterList = new ArrayList<Mutter>();
			servletContext.setAttribute("mutterList", mutterList);
			
		}
		
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		
		if (Objects.isNull(user)) {
			response.sendRedirect("/");
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
