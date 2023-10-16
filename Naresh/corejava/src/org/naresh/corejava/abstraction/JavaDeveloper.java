package org.naresh.corejava.abstraction;

public class JavaDeveloper extends SoftwareCareer {
	
	String personName;

	public JavaDeveloper(String type, String personName) {
		super(type);
		this.personName = personName;
	}



	@Override
	public void technicalJob() {
		System.out.println(personName + " if you want to become Java Developer you have learn following technical concepts");
		System.out.println("CoreJava, Adv Java, SQL, Spring Framework");
	}

}
