package org.naresh.corejava.inheritence;

public class Person {
	String name;
	char gender;
	Car c;
	
	
	public Person(String name, char gender, Car c) {
		this.name = name;
		this.gender = gender;
		this.c = c;
	}
	
	public void goForLongDrive(String destination) {
		System.out.println(name+" is ready for Long drive");
		c.longDrive(destination);
	}

}
