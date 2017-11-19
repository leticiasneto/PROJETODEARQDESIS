package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.User;
import service.UserService;
import transferObject.UserTO;

/**
 * Servlet implementation class UserController
 */
@WebServlet("/UserController.do")
public class UserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String stringLogin = "", stringPassword = ""; 
		int intType = 0;
		User user;
		UserTO userTO;
		
		try{
			
			stringLogin = request.getParameter("stringLogin");
			stringPassword = request.getParameter("stringPassword");
			intType = 2;
			
		}
		catch (Exception e) {
			
		 e.printStackTrace();
		}
		finally{
			System.out.println("aqui");
			//JavaBean
			user = new User();
			user.setIntType(intType);
			System.out.println(user.getIntType());
			user.setStringLogin(stringLogin);
			System.out.println(user.getStringLogin());
			user.setStringPassword(stringPassword);
			System.out.println(user.getStringPassword());
			//UserTO
			
			userTO = new UserTO();
			System.out.println("aqui" );
			userTO.setIntType(user.getIntType());
			System.out.println(userTO.getIntType());
			userTO.setStringLogin(user.getStringLogin());
			System.out.println(userTO.getStringLogin());
			userTO.setStringPassword(user.getStringPassword());
			System.out.println(userTO.getStringPassword());
			
			
		}
		
		
		UserService userService = new UserService();
		userService.create(userTO);
		userTO = userService.read(2);

		PrintWriter printWriter = response.getWriter();
		printWriter.println("<html><head><title>Sucess</title></head><body>");
		printWriter.println( "Type: "+userTO.getIntType()+"<br>");
		printWriter.println( "Login: "+userTO.getStringLogin()+"<br>");
		printWriter.println( "Password: "+userTO.getStringPassword()+"<br>");
		printWriter.println("</body></html>");
		
		
	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */
