package org.naresh.corejava.classobject;

public class StudentClient {

	public static void main(String[] args) {
		System.out.println(Calculator.sumOfMyChoice(1,5,6,9,70));
		Calculator c = new Calculator("Famous");
		c.squart(4.0);
		c.protectedSquart(16);
		c.defaultSquart(16.0);
		//I cannot access private members from another class
		//c.privateSquart(16.0);
		LogicalPrograms.printPrimeNumbers(100, 200);
		LogicalPrograms.printPrimeNumbers(1, 100);
		LogicalPrograms.printPrimeNumbers(1000, 1100);
		

	}

}
