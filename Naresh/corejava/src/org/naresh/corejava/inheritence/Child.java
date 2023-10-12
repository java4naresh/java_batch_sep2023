package org.naresh.corejava.inheritence;

public class Child extends Parent {
	
	String extraSkils;
	
	String education;
	
	public Child(String surName, String healthIssues, String properties, int houses,
			String extraSkils, String education) {
		super();
		this.surName = surName;
		this.healthIssues = healthIssues;
		this.properties = properties;
		this.houses = houses;
		this.extraSkils = extraSkils;
		this.education = education;
	}
	
	public Child() {
		
	}
	
	public void cellPhoneUsage(int hours) {
		System.out.println("cell phone usage is "+ hours + "hours");
	}  

	public void lateNightSpending(int time) {
		System.out.println("Late night spent time is "+ time + " hours");
	}

}