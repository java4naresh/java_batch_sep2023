package org.naresh.corejava.encapuslation;

public class PrimeLogin {

	public static void main(String[] args) {
		AmazonPrimeUser user = new AmazonPrimeUser("naresh", "naresh@123");
		AmazonPrimeUser user2 = new AmazonPrimeUser("naresh", "naresh@123");
        //System.out.println(user.password);
		System.out.println(user.getPassword());
	    System.out.println(user);
	    System.out.println(user.equals(user2));
	}

}
