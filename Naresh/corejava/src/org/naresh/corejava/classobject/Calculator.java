package org.naresh.corejava.classobject;

public class Calculator {
	
	String name;
	
	public Calculator() {
		
	}
	
	public Calculator(String name) {
		this.name = name;
	}
	
	public void squart(double number) {
		double sqrtValue = Math.sqrt(number);
		System.out.println(sqrtValue+" calculated by "+ name);
	}
	
	public static int sum(int num1, int num2) {
		return num1+num2;
	}
	
	public static int sumOfMyChoice(int... numbers) {
		int sum = 0;
		for(int number:numbers) {
			sum = sum + number;
		}
		return sum;
	}
	
	public static int mulOfMyChoice(int... numbers) {
		int mul = 1;
		for(int number:numbers) {
			mul = mul * number;
		}
		return mul;
		
	}
	
	public static void main(String[] args) {
		//Calculator c = new Calculator();
		//c.sum(10, 20);
		System.out.println(Calculator.sumOfMyChoice(10,20,30,40,50));
		System.out.println(Calculator.mulOfMyChoice(1,2,3,4,5));
	}

}
