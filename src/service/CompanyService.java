package service;

import dao.CompanyDAO;
import model.Company;
import transferObject.CompanyTO;

public class CompanyService {

CompanyDAO companyDAO = new CompanyDAO();
	
	
	public void create(CompanyTO companyTO) {
		companyDAO.insert(companyTO);
	}

	public void update(CompanyTO companyTO) {
		companyDAO.update(companyTO);
	}

	public void delete(CompanyTO companyTO) {
		companyDAO.delete(companyTO);
	}

	public CompanyTO read(int intCompanyCNPJ){
		
		return companyDAO.read(intCompanyCNPJ);
		
	}
	
	
	
}
/*Design by Wesley Ramos Leite, All Rights Reserved*/