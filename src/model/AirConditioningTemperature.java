package model;

import java.io.Serializable;

public class AirConditioningTemperature implements Serializable {

	private boolean booleanStatus;

	// Constructor

	public AirConditioningTemperature(boolean booleanStatus) {

		setBooleanStatus(booleanStatus);
		
	}

	public AirConditioningTemperature() {

		booleanStatus = false;
		
	}

	// Set

	public void setBooleanStatus(boolean booleanStatus) {
		this.booleanStatus = booleanStatus;
	}

	// Get
	public boolean isBooleanStatus() {
		return booleanStatus;
	}

}
