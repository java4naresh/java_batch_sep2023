package org.naresh.corejava.inheritence;

public class Child2 extends Parent {
	
	String deisgnation;
	
	public Child2(String surName, String healthIssues, String properties, int houses, String deisgnation) {
		this.surName = surName;
		this.healthIssues = healthIssues;
		this.properties = properties;
		this.houses = houses;
		this.deisgnation = deisgnation;
	}
	
	public void badHabits(boolean flag) {
		if(flag) {
			System.out.println("Bad Habits");
		} else {
			System.out.println("No Bad Habits");
		}
	}

}
