package service;

import dao.AirConditioningTemperatureDAO;
import model.AirConditioningTemperature;
import transferObject.AirConditioningTemperatureTO;


public class AirConditioningTemperatureService {

	AirConditioningTemperatureDAO airConditioningTemperatureDAO = new AirConditioningTemperatureDAO();
	
	
	public void create(AirConditioningTemperatureTO airConditioningTemperatureTO) {
		airConditioningTemperatureDAO.insert(airConditioningTemperatureTO);
	}

	public void update(AirConditioningTemperatureTO airConditioningTemperatureTO) {
		airConditioningTemperatureDAO.update(airConditioningTemperatureTO);
	}

	public void delete(AirConditioningTemperatureTO airConditioningTemperatureTO) {
		airConditioningTemperatureDAO.delete(airConditioningTemperatureTO);
	}

	public AirConditioningTemperatureTO read(int id){
		return airConditioningTemperatureDAO.read(id);
		
	}
	
	
	
	
}
