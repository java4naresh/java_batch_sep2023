package org.naresh.corejava.inheritence;

public class Parent {
	
	String surName;
	
	String healthIssues;
	
	String properties;
	
	int houses;
	
	
	
	public Parent(String surName, String healthIssues, String properties, int houses) {
		this.surName = surName;
		this.healthIssues = healthIssues;
		this.properties = properties;
		this.houses = houses;
	}
	
	public Parent() {
		
	}

	public void eatingHabits(String habits) {
		System.out.println("habits is"+ habits);
	}
	
	public void snorring(boolean flag) {
		if(flag) {
			System.out.println("snorring");
		} else {
			System.out.println("no snorring");
		}
	}
	
	public void behaviours(String behaviuors) {
		System.out.println("behaviours is "+ behaviuors);
	}
}
