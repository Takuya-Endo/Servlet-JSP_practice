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

import siteEV.model.SiteEV;
import siteEV.model.SiteEVLogic;

@WebServlet("/MinatoIndex")
public class MinatoIndex extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String action = request.getParameter("action");
		ServletContext servletContext = this.getServletContext();
		SiteEVLogic logic = new SiteEVLogic();
		
		if (Objects.isNull(action)) {
			SiteEV siteEV = new SiteEV();
			servletContext.setAttribute("siteEV", siteEV);
		}
		
		if ("like".equalsIgnoreCase(action)) {
			
			SiteEV siteEV = (SiteEV) servletContext.getAttribute("siteEV");
			logic.addLike(siteEV);
			servletContext.setAttribute("siteEV", siteEV);
			
		}
		
		if ("dislike".equalsIgnoreCase(action)) {
			
			SiteEV siteEV = (SiteEV) servletContext.getAttribute("siteEV");
			logic.addDislike(siteEV);
			servletContext.setAttribute("siteEV", siteEV);
			
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
