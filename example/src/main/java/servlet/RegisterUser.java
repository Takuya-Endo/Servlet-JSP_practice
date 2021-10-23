package servlet;

import java.io.IOException;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import register.model.RegisterUserLogic;
import register.model.User;

/**
 * Servlet implementation class RegisterUser
 */
@WebServlet("/RegisterUser")
public class RegisterUser extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");		
		String url = "";
		
		if (Objects.isNull(action)) {
			url = "/WEB-INF/jsp/registerForm.jsp";
		} else if ("done".equals(action)) {
			
			RegisterUserLogic registerUserLogic = new RegisterUserLogic();
			HttpSession httpSession = request.getSession();
			User user = (User) httpSession.getAttribute("user");
			registerUserLogic.registUserInfo(user);
			
			url = "/WEB-INF/jsp/registerDone.jsp";
			httpSession.removeAttribute("user");
			
		}
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher(url);
		requestDispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");
		String pass = request.getParameter("pass");
		String name = request.getParameter("name");
		
		User user = new User(id, pass, name);
		
		HttpSession httpSession = request.getSession();
		httpSession.setAttribute("user", user);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/registerConfirm.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
