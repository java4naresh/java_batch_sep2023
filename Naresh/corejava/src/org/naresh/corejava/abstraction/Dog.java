package org.naresh.corejava.abstraction;

public class Dog extends Animal {
	
	String dogBreed;
	String dogName;

	public Dog(String dogBreed, String dogName) {
		super();
		this.dogBreed = dogBreed;
		this.dogName = dogName;
	}

	@Override
	public void makeSound() {
		
	   System.out.println("my name is "+ dogName + ", I will make sound bow bow");
		
	}

}
