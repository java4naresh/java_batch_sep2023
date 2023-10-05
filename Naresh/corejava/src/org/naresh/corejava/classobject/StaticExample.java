package org.naresh.corejava.classobject;

public class StaticExample {
	
	static int numb = getNumber();
	int numb2 = getNumber2();
	
	{
		System.out.println("non-static1");
	}
	
	static {
		System.out.println(numb);
		System.out.println("static2");
	}
	
	static {
		System.out.println(numb);
		System.out.println("static1");
	}
	
	public static int getNumber() {
		System.out.println("getNumber");
		return 10;
	}
	
	public int getNumber2() {
		System.out.println("getNumber2");
		return 20;
	}
	
	public StaticExample() {
		System.out.println("cons");
	}

	public static void main(String[] args) {
		StaticExample se = new StaticExample();
		StaticExample se2 = new StaticExample();
		StaticExample se3 = new StaticExample();
	}
	
	{
		System.out.println("non-static2");
	}

}
