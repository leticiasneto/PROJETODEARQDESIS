package command;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.User;
import transferObject.UserTO;

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
		User usuario = new User();
		usuario.setStringLogin(stringUserName);
		usuario.setStringPassword(stringPassword);
		HttpSession session = request.getSession();

		System.out.println(stringPassword + "---" + stringUserName);
		if (stringUserName.equals("adm") && stringPassword.equals("adm")) {
			usuario.setLogin(true);
			UserTO userTO = new UserTO();
			userTO.setStringLogin(usuario.getStringLogin());
			userTO.setStringPassword(usuario.getStringPassword());
			userTO.setLogin(usuario.isLogin());

			session.setAttribute("logado", userTO);

		}

		else {

			RequestDispatcher requestDispatcher = request.getRequestDispatcher("ErrorLoginJSP.jsp");
			try {
				requestDispatcher.forward(request, response);
			} catch (ServletException | IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

		}

		try {
			response.sendRedirect("HomeJSP.jsp");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
