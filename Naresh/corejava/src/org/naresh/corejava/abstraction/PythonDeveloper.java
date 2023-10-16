package org.naresh.corejava.abstraction;

public class PythonDeveloper  extends SoftwareCareer {
	
	String personName;

	public PythonDeveloper(String type, String personName) {
		super(type);
		this.personName = personName;
	}



	@Override
	public void technicalJob() {
		System.out.println(personName + " if you want to become Python Developer you have learn following technical concepts");
		System.out.println("CorePython, Adv Python, SQL, D Jango");	
	}

}
