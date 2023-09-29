package org.naresh.corejava.classobject;

public class Calculator {
	
	public int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public int sumOfMyChoice(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
	
	public int mulOfMyChoice(int... numbers) {
		int mul = 1;
		for(int number:numbers) {
			mul = mul * number;
		}
		return mul;
		
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		//c.sum(10, 20);
		System.out.println(c.sumOfMyChoice(10,20,30,40,50));
		System.out.println(c.mulOfMyChoice(1,2,3,4,5));
	}

}
