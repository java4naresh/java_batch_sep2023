package org.naresh.corejava.inheritence;

public class Car {
	
	String brand;
	String model;
	int milage;
	String color;
	
	
	
	public Car(String brand, String model, int milage, String color) {
		this.brand = brand;
		this.model = model;
		this.milage = milage;
		this.color = color;
	}



	public void longDrive(String destination) {
		System.out.println("Enjoy music");
		System.out.println("Using "+ brand+ " of model "+model + " went to "+destination);
	    System.out.println("Reached Destination");
	}

}
