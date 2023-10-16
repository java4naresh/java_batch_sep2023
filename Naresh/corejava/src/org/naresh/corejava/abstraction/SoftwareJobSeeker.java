package org.naresh.corejava.abstraction;

public class SoftwareJobSeeker {

	public static void main(String[] args) {
		SoftwareCareer java = new JavaDeveloper("Technical", "Naresh");
		java.basics();
		java.technicalJob();
		System.out.println("================");
		SoftwareCareer python = new PythonDeveloper("Technical", "Naresh");
		python.basics();
		python.technicalJob();

	}

}
