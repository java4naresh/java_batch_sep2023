package org.naresh.corejava.inheritence;

import org.naresh.corejava.classobject.Calculator;

public class FamousCalculator extends Calculator {
	
	public void squrt(int num) {
		//i can access public members from super class
		squart(num);
		//i can access protected members from super class eventhough outside package
		protectedSquart(num);
		//i can not access default members from super class eventhough outside package
		//defaultSquart(num);
		//i can not access private members from another class
		//privateSquart(16.0);
	}

}
