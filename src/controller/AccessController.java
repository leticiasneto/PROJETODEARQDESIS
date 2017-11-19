package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Access;
import service.AccessService;
import transferObject.AccessTO;

/**
 * Servlet implementation class AccessController
 */
@WebServlet("/AccessController.do")
public class AccessController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AccessController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
        
		double doubleCheckIn = 0.0;
		double doubleCheckOut = 0.0;
		int intDayCheckIn = 0;
		Access access;
		AccessTO accessTO;
		try {
			doubleCheckIn = Double.parseDouble(request.getParameter("doubleCheckIn"));
			doubleCheckOut = Double.parseDouble(request.getParameter("doubleCheckOut"));
			intDayCheckIn = Integer.parseInt(request.getParameter("intDayCheckIn"));
		}

		catch (Exception e) {
			e.printStackTrace();
		}
finally {
	
	//JavaBean
		access = new Access();
		access.setDoubleCheckIn(doubleCheckIn);
		access.setDoubleCheckOut(doubleCheckOut);
		access.setIntDayCheckIn(intDayCheckIn);
	//TO
		accessTO = new AccessTO();
		accessTO.setDoubleCheckIn(access.getDoubleCheckIn());
		accessTO.setDoubleCheckOut(access.getDoubleCheckOut());
		accessTO.setIntDayCheckIn(access.getIntDayCheckIn());
		
}
	

		//Service
		AccessService accessService = new AccessService();
		//accessService.create(accessTO);
		
		//AccessTo from Access
		accessTO = accessService.read(accessTO.getIntDayCheckIn());
		access.setDoubleCheckIn(accessTO.getDoubleCheckIn());
		access.setDoubleCheckOut(accessTO.getDoubleCheckOut());
		access.setIntDayCheckIn(accessTO.getIntDayCheckIn());
		
		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><head><title>Sucess</title></head><body>");
		printWriter.println( "Day CheckIn: "+"04"+"<br>");
		printWriter.println( "CheckIn: "+"18:00"+"<br>");
		printWriter.println( "CheckOut: "+"23:00"+"<br>");
		printWriter.println("</body></html>");
		
		
		
	
	}

}
