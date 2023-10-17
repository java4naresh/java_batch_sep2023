package org.naresh.corejava.polymorphism;

public class Calculator {
	
	//static polymorphism example
	
	public void sum(int num1, int num2) {
		int sum = num1 + num2;
		System.out.println(sum);
	}
	
	public int sum(int num1, int num2, int num3) {
		int sum = num1 + num2 + num3;
		return sum;
	}
	
	public void multiply(int num1, int num2) {
		System.out.println(num1*num2);
	}
	
	public double multiply(double num1, double num2) {
		return num1 * num2;
	}
	
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.sum(10, 20);
		int sumOf3 = c.sum(10, 20, 30);
		System.out.println(sumOf3);
		
		c.multiply(1,  2);
		System.out.println(c.multiply(1.0, 5.0));
	}

}
