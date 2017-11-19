package transferObject;

import java.util.ArrayList;

public class CompanyTO  {

	private String stringCnpj;
	private String stringCompanyName;
	private String stringCheckIn;
	private String stringCheckOut;
	private int intStandardTemperatureOfAirConditioning;
	private String stringAirConditioningCheckIn;
	private String stringAirConditioningCheckOut;
	private ArrayList<PropertySetTO> arrayListPropertSet;


	
	// Sets

	public void setStringCnpj(String stringCnpj) {
		this.stringCnpj = stringCnpj;
	}

	public void setStringCompanyName(String stringCompanyName) {
		this.stringCompanyName = stringCompanyName;
	}

	public void setStringCheckIn(String stringCheckIn) {
		this.stringCheckIn = stringCheckIn;
	}

	public void setStringCheckOut(String stringCheckOut) {
		this.stringCheckOut = stringCheckOut;
	}

	public void setIntStandardTemperatureOfAirConditioning(int intStandardTemperatureOfAirConditioning) {
		this.intStandardTemperatureOfAirConditioning = intStandardTemperatureOfAirConditioning;
	}

	public void setStringAirConditioningCheckIn(String stringAirConditioningCheckIn) {
		this.stringAirConditioningCheckIn = stringAirConditioningCheckIn;
	}

	public void setStringAirConditioningCheckOut(String stringAirConditioningCheckOut) {
		this.stringAirConditioningCheckOut = stringAirConditioningCheckOut;
	}

	public void setArrayListPropertSet(ArrayList<PropertySetTO> arrayListPropertSetTO) {
		this.arrayListPropertSet = arrayListPropertSetTO;
	}

	// Gets

	public String getStringCnpj() {
		return stringCnpj;
	}

	public String getStringCompanyName() {
		return stringCompanyName;
	}

	public String getStringCheckIn() {
		return stringCheckIn;
	}

	public String getStringCheckOut() {
		return stringCheckOut;
	}

	public int getIntStandardTemperatureOfAirConditioning() {
		return intStandardTemperatureOfAirConditioning;
	}

	public String getStringAirConditioningCheckIn() {
		return stringAirConditioningCheckIn;
	}

	public String getStringAirConditioningCheckOu() {
		return stringAirConditioningCheckOut;
	}

	public ArrayList<PropertySetTO> getArrayListPropertSet() {
		return arrayListPropertSet;
	}

}
