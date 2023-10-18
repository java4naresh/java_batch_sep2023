package org.naresh.corejava.encapuslation;

public class AmazonPrimeUser {
	
	private String userName;
	private String password;

	public AmazonPrimeUser(String userName, String password) {
		this.userName = userName;
		this.password = password;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	public boolean equals(AmazonPrimeUser user) {
		if(this.userName.equals(user.getUserName()) && this.password.equals(user.getPassword()))
			return true;
		return false;
	}

	@Override
	public String toString() {
		return "AmazonPrimeUser [userName=" + userName + ", password=" + password + "]";
	}

}
