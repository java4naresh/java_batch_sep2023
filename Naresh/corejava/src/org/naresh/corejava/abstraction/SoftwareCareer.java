package org.naresh.corejava.abstraction;

public abstract class SoftwareCareer {
	
	String type;
	
	public SoftwareCareer(String type) {
		super();
		this.type = type;
	}

	public void basics() {
		if(type == "Technical") {
			System.out.println("If you want technical job in the software industry, you should be proficient in english and 'C' Language");
		} else {
			System.out.println("If you want non-technical job in the software industry, you should be proficient in english");
		}
	}
	
	public abstract void technicalJob();

}
