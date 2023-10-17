package org.naresh.corejava.polymorphism;

public class EndUser {

	public static void main(String[] args) {
		TourPlan tp = new TourPlan();
		Bus b = new Bus();
		tp.tour(b);

	}

}
