package model;

import java.io.Serializable;

public class User implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String stringLogin;
	private String stringPassword;
	private int intType;
	private boolean login;

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

	public boolean isLogin() {
		return login;
	}

	public void setLogin(boolean login) {
		this.login = login;
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
/*Design by Wesley Ramos Leite, All Rights Reserved*/
