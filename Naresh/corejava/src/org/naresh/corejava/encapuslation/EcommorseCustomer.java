package org.naresh.corejava.encapuslation;

public class EcommorseCustomer {

	public static void main(String[] args) {
		Order phone = new Order(1, "Iphone", 720000, "Ameerpet, Hyderabad");
		System.out.println(phone.getAddress());
		phone.setAddress("Kukatpally, Hyderabad");
		System.out.println(phone.getAddress());
		//System.out.println(phone.address);
	}

}
