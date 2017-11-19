package model;

import java.io.Serializable;

public class Access implements Serializable{

	/* Warning -> Check like a Hours only */
	private double doubleCheckIn;
	private double doubleCheckOut;
	private int intDayCheckIn;

	// Constructor

	public Access(double doubleCheckIn, double doubleCheckOut, int intDayCheckIn) {

		setIntDayCheckIn(intDayCheckIn);
		setDoubleCheckOut(doubleCheckOut);
		setIntDayCheckIn(intDayCheckIn);

	}

	public Access() {

		doubleCheckIn = 0.0;
		doubleCheckOut = 0.0;
		intDayCheckIn = 0;

	}

	// Sets

	public void setDoubleCheckIn(double doubleCheckIn) {
		this.doubleCheckIn = doubleCheckIn;
	}

	public void setDoubleCheckOut(double doubleCheckOut) {
		this.doubleCheckOut = doubleCheckOut;
	}

	public void setIntDayCheckIn(int intDayCheckIn) {
		this.intDayCheckIn = intDayCheckIn;
	}

	// Gets

	public double getDoubleCheckIn() {
		return doubleCheckIn;
	}

	public double getDoubleCheckOut() {
		return doubleCheckOut;
	}

	public int getIntDayCheckIn() {
		return intDayCheckIn;
	}

}
