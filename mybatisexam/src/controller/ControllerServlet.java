package controller;
import java.io.IOException;


import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



public class ControllerServlet extends HttpServlet{

	@Override

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String command = request.getParameter("command");
		CommandInter inter = null;
		String viewName = "";

		
		try {
			if(command.equals("sangpum")){
				inter = SangpumImpl.instance();
				viewName = inter.showData(request, response);
				viewName = "view/"+viewName;
				request.getRequestDispatcher(viewName).forward(request, response);
			} 
		} catch (Exception e) {

		}
	}
}



