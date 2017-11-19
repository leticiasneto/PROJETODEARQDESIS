package service;

import dao.PropertySetDAO;
import model.PropertySet;
import transferObject.PropertySetTO;

public class PropertySetService {
	PropertySetDAO propertySetDAO = new PropertySetDAO();

	public void create(PropertySetTO propertySetTO) {
		propertySetDAO.insert(propertySetTO);
	}

	public void update(PropertySetTO propertySetTO) {
		propertySetDAO.update(propertySetTO);
	}

	public void delete(PropertySetTO propertySetTO) {
		propertySetDAO.delete(propertySetTO);
	}

	public PropertySetTO read(int id) {
		return propertySetDAO.read(id);

	}

}
