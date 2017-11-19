package service;

import dao.AccessDAO;
import transferObject.AccessTO;
import transferObject.UserTO;

public class AccessService {

	AccessDAO acessDAO = new AccessDAO();

	public void create(AccessTO acessTO, UserTO userTO) {
		acessDAO.insert(acessTO,userTO );
	}

	public void update(AccessTO acessTO) {
		acessDAO.update(acessTO);
	}

	public void delete(AccessTO acessTO) {
		acessDAO.delete(acessTO);
	}

	public AccessTO read(int id){
	return acessDAO.read(id);
		
	}

}
/* Design by Wesley Ramos Leite, All Rights Reserved */