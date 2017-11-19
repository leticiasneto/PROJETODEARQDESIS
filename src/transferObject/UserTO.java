package transferObject;

public class UserTO  {

	private String stringLogin;
	private String stringPassword;
	private int intType;
	private boolean login;
	

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
