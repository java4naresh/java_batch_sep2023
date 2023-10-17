package org.naresh.corejava.polymorphism;

public class TourPlan {
	
	public void tour(Bus bus) {
		System.out.println("Bus Tour");
	}
	
	public void tour(Train train) {
		System.out.println("Train Tour");
	}
	
	public void tour(Car car) {
		System.out.println("Car Tour");
	}
	
	public void tour(Flight flight) {
		System.out.println("Flight Tour");
	}

}
