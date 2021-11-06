package servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Objects;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.GetMutterListLogic;
import model.Mutter;
import model.PostMutterLogic;
import model.User;

@WebServlet("/Main")
public class Main extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
		ArrayList<Mutter> mutterList = getMutterListLogic.execute();
		request.setAttribute("mutterList", mutterList);
		
		if (Objects.isNull(mutterList)) {
			
//			mutterList = new ArrayList<Mutter>();
//			servletContext.setAttribute("mutterList", mutterList);
			
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
		
		GetMutterListLogic getMutterListLogic = new GetMutterListLogic();
		ArrayList<Mutter> mutterList = getMutterListLogic.execute();
		request.setAttribute("mutterList", mutterList);
		
		HttpSession httpSession = request.getSession();
		User user = (User) httpSession.getAttribute("user");
		String text = request.getParameter("text");
		
		if ("".equals(text)) {
			request.setAttribute("error", "つぶやきが入力されていません");
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
			requestDispatcher.forward(request, response);
			return;
		}

//		ServletContext servletContext = this.getServletContext();
		Mutter mutter = new Mutter(user.getName(), text);
		PostMutterLogic postMutterLogic = new PostMutterLogic();
		postMutterLogic.execute(mutter);
		
		mutterList = getMutterListLogic.execute();
		request.setAttribute("mutterList", mutterList);
		
		RequestDispatcher requestDispatcher = request.getRequestDispatcher("/WEB-INF/jsp/main.jsp");
		requestDispatcher.forward(request, response);
		
	}

}
