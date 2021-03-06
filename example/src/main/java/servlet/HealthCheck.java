package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import health.model.Health;
import health.model.HealthCheckLogic;

/**
 * Servlet implementation class HealthCheck
 */
@WebServlet("/HealthCheck")
public class HealthCheck extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheck.jsp");
		dispatcher.forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String height = request.getParameter("height");
		String weight = request.getParameter("weight");
		Health health = new Health(height, weight);
		
		HealthCheckLogic logic = new HealthCheckLogic();
		String bmi = logic.checkBmi(height, weight);
		health.setBmi(bmi);
		String shape = logic.judgeBmi(bmi);
		health.setShape(shape);
		
		request.setAttribute("health", health);
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/jsp/healthCheckResult.jsp");
		dispatcher.forward(request, response);
		
	}

}
