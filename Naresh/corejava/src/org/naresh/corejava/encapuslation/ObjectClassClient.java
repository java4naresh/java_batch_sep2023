package org.naresh.corejava.encapuslation;

public class ObjectClassClient {

	public static void main(String[] args) {
		Order order = new Order(1,"phone", 12000.0, "Hyderabad");
		ObjectClassExamples.setName(order);

	}

}
