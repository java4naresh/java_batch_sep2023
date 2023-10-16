package org.naresh.corejava.abstraction;

public class Cat extends Animal {
	
	String catName;
	
	public Cat(String catName) {
		super();
		this.catName = catName;
	}

	@Override
	public void makeSound() {
		System.out.println("my name is "+ catName + ", I will make sound mew mew");
		
	}

}
