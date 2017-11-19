package model;

import java.io.Serializable;

public class User implements Serializable {

	private String stringLogin;
	private String stringPassword;
	private int intType;

	// Constructor

	public User(String stringLogin, String stringPassword, int intType) {

		setStringLogin(stringLogin);
		setStringPassword(stringPassword);
		setIntType(intType);
	

	}

	public User() {

		this.stringLogin = "";
		this.stringPassword = "";
		this.intType = -1;

	}

	// Sets
	public void setStringLogin(String stringLogin) {
		this.stringLogin = stringLogin;
	}

	public void setStringPassword(String stringPassword) {
		this.stringPassword = stringPassword;
	}

	public void setIntType(int intType) {
		this.intType = intType;
	}

	// Gets

	public String getStringLogin() {
		return stringLogin;
	}

	public String getStringPassword() {
		return stringPassword;
	}

	public int getIntType() {
		return intType;
	}

}
