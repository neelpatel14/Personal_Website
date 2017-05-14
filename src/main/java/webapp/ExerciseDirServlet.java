package webapp;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = "/ActiveRun")
public class ExerciseDirServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		 String timing = request.getParameter("timing");
    	 String alertType = request.getParameter("alert");
    	request.setAttribute("timing", timing);
    	request.setAttribute("alertType", alertType);
    	request.getRequestDispatcher("/WEB-INF/views/excDir.jsp").forward(request,response);
    }

@Override 
protected void doPost (HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	request.setAttribute("work", "This would display");
	request.getRequestDispatcher("/WEB-INF/views/excDir.jsp").forward(request, response);
}
}
