package org.naresh.corejava.serialization;

import java.io.Serializable;

public class PrimeUser implements Serializable {
	
	private String userName;
	private transient String password;

	public PrimeUser(String userName, String password) {
		super();
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

	@Override
	public String toString() {
		return "PrimeUser [userName=" + userName + ", password=" + password + "]";
	}
	
	
	

}
