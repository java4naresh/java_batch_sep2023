package org.naresh.corejava.polymorphism;

public class DynamicPolymorphismMain {

	public static void main(String[] args) {
		//dynamic polymorphism example
		Father f = new Father();
		f.makeMoney();
		Son s = new Son();
		s.makeMoney();

	}

}
