package command;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Access;
import service.AccessService;
import transferObject.AccessTO;

public class AccessCommand implements Command {

	public AccessCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		 
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
		
		PrintWriter printWriter;
		try {
			printWriter = response.getWriter();
			printWriter.println("<html><head><title>Sucess</title></head><body>");
			printWriter.println( "Day CheckIn: "+accessTO.getIntDayCheckIn()+"<br>");
			printWriter.println( "CheckIn: "+accessTO.getDoubleCheckIn()+"<br>");
			printWriter.println( "CheckOut: "+accessTO.getDoubleCheckOut()+"<br>");
			printWriter.println("</body></html>");
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	
	}


	}


