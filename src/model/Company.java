package model;

import java.io.Serializable;
import java.util.ArrayList;

public class Company implements Serializable {

	private String stringCnpj;
	private String stringCompanyName;
	private String stringCheckIn;
	private String stringCheckOut;
	private int intStandardTemperatureOfAirConditioning;
	private String stringAirConditioningCheckIn;
	private String stringAirConditioningCheckOut;
	private ArrayList<PropertySet> arrayListPropertSet;

	// Constructors

	public Company(String stringCnpj, String stringCompanyName, String stringCheckIn, String stringCheckOut,
			int intStandardTemperatureOfAirConditioning, String stringAirConditioningCheckIn,
			String stringAirConditioningCheckOut, ArrayList<PropertySet> arrayListPropertSet) {

		setStringCnpj(stringCnpj);
		setStringCompanyName(stringCompanyName);
		setStringCheckIn(stringCheckIn);
		setStringCheckOut(stringCheckOut);
		setIntStandardTemperatureOfAirConditioning(intStandardTemperatureOfAirConditioning);
		setStringAirConditioningCheckIn(stringAirConditioningCheckIn);
		setStringAirConditioningCheckOut(stringAirConditioningCheckOut);
		setArrayListPropertSet(arrayListPropertSet);
	}

	public Company() {

		this.stringCnpj = "";
		this.stringCompanyName = "";
		this.stringCheckIn = "";
		this.stringCheckOut = "";
		this.intStandardTemperatureOfAirConditioning = 0;
		this.stringAirConditioningCheckIn = "";
		this.stringAirConditioningCheckOut = "";
		this.arrayListPropertSet = new ArrayList<PropertySet>();
	}

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

	public void setArrayListPropertSet(ArrayList<PropertySet> arrayListPropertSet) {
		this.arrayListPropertSet = arrayListPropertSet;
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

	public ArrayList<PropertySet> getArrayListPropertSet() {
		return arrayListPropertSet;
	}

}
/*Design by Wesley Ramos Leite, All Rights Reserved*/
