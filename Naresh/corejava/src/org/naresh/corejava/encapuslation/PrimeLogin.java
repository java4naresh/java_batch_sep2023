package org.naresh.corejava.encapuslation;

public class PrimeLogin {

	public static void main(String[] args) {
		AmazonPrimeUser user = new AmazonPrimeUser("naresh", "naresh@123");
		AmazonPrimeUser user2 = new AmazonPrimeUser("naresh", "naresh@123");
        //System.out.println(user.password);
		System.out.println(user.getPassword());
	    System.out.println(user);
	    System.out.println(user.equals(user2));
	    System.out.println(user.hashCode());//
	    System.out.println(user2.hashCode());//
	    //up casting and down casting
	    //Object class is the super class for all the classes, 
	    //so object class reference will hold any child object
	    Object obj = new AmazonPrimeUser("nikita", "nikita@123");
	    Object obj2 = new Object();
	    Object obj3 = "";
	    Object obj4 = 1;
	    //AmazonPrimeUser prime = new Object(); down casting will not possible directly
	    //AmazonPrimeUser prime = (AmazonPrimeUser) obj;// down casting
	    System.out.println(obj.hashCode());//
	    AmazonPrimeUser prime2 = (AmazonPrimeUser) obj2;
	}

}
