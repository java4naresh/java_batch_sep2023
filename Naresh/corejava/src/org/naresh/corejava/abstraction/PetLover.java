package org.naresh.corejava.abstraction;

public class PetLover {

	public static void main(String[] args) {
		Animal dog = new Dog("German Shephard", "Rocky");
		dog.eat();
		dog.makeSound();
		
		Animal cat = new Cat("Lucy");
		cat.eat();
		cat.makeSound();

	}

}
