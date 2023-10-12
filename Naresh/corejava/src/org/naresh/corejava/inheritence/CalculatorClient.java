package org.naresh.corejava.inheritence;

import org.naresh.corejava.classobject.Calculator;

public class CalculatorClient {

	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.squart(16);
		//I cannot access protected members from outside package
		//c.protectedSquart(16);
		//I cannot access default members from outside package
		//c.defaultSquart(16.0);
		//I cannot access private members from outside package
		//c.privateSquart(16.0);

	}

}
