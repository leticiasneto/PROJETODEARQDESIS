package service;

import dao.UserDAO;
import transferObject.UserTO;

public class UserService {

	UserDAO userDAO = new UserDAO();

	public void create(UserTO userTO) {
		userDAO.insert(userTO);
	}

	public void update(UserTO userTO) {
		userDAO.update(userTO);
	}

	public void delete(UserTO userTO) {
		userDAO.delete(userTO);
	}

	public UserTO read(int id){
		return userDAO.read(id);
		
	}

}
