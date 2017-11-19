package service;

import java.util.ArrayList;

import dao.UserDAO;
import model.Cliente;
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

	public ArrayList<Cliente> listarClientes(String chave) {
		// TODO Auto-generated method stub
		return null;
	}

	public ArrayList<Cliente> listarClientes() {
		// TODO Auto-generated method stub
		return null;
	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */