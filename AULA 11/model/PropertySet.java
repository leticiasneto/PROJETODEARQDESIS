package model;

import java.io.Serializable;

public class PropertySet implements Serializable {

	private int intFloor;
	private String stringName;

	// Constructor
	public PropertySet(int intFloor, String stringName) {

		setIntFloor(intFloor);
		setStringName(stringName);

	}

	public PropertySet() {

		this.intFloor = 0;
		this.stringName = "";
	}

	// Sets
	public void setIntFloor(int intFloor) {
		this.intFloor = intFloor;
	}

	public void setStringName(String stringName) {
		this.stringName = stringName;
	}

	// Gets
	public int getIntFloor() {
		return intFloor;
	}

	public String getStringName() {
		return stringName;
	}

}
