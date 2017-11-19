package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginCommand implements Command {

	public LoginCommand() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {

		String stringUserName;
		String stringPassword;
		
		stringUserName = request.getParameter("stringUserName");
		stringPassword = request.getParameter("stringPassword"); 		
		
		System.out.println(stringPassword + "---" + stringUserName);
		if(stringUserName.equals("adm") && stringPassword.equals("adm")){
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("HomeJSP.jsp");
			try {
				requestDispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	
		
		}
		
		else{
			
			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorLoginJSP.jsp");
			try {
				requestDispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}

}
