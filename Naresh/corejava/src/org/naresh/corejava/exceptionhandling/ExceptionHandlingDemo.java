package org.naresh.corejava.exceptionhandling;

public class ExceptionHandlingDemo {

	public static void main(String[] args) {
		ExceptionHandlingDemo.division(10, 0);
		ExceptionHandlingDemo.checkValue("Naresh", "Kambala");
		int[] arr = {1,2,3,4,5};
		//ExceptionHandlingDemo.getIndexValue(new int[] {1,2,3,4,5}, 2);
		ExceptionHandlingDemo.getIndexValue(arr, 2);
		ExceptionHandlingDemo.getStringIndexValue("Naresh", 0);

	}
	
	public static void division(int num1, int num2) {
		try {
		System.out.println(num1/num2);
		} catch(ArithmeticException e) {
			//e.printStackTrace();
			//System.out.println(e.getMessage());
			System.out.println(e.toString());
		} catch(Exception e) {
		
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void checkValue(String word, String substring) {
		try {
		if(word.contains(substring)) {
			System.out.println("Contains");
		} else {
			System.out.println("Not Contains");
		}
		} catch(NullPointerException e) {
			e.printStackTrace();
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void getIndexValue(int[] arr, int index) {
		try {
		System.out.println(arr[index]);
		} catch(Exception e) {
			e.printStackTrace();
		} finally {
			System.out.println("Exception handled");
		}
	}
	
	public static void getStringIndexValue(String value, int index) {
		try {
			System.out.println(value.charAt(index));
			} catch(Exception e) {
				e.printStackTrace();
			} finally {
				System.out.println("Exception handled");
			}
	}

}
