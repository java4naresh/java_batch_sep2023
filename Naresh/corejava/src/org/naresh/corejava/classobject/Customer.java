package org.naresh.corejava.classobject;

public class Customer {
	
	String name;
	char gender;
	int age;
	static String bankName;
	static String mainBranchAddress;
	static String bankCode;
	
	static {
		System.out.println("static");
		mainBranchAddress = "Mumbai";
		bankName = "HDFC Bank";
		bankCode = "HDFC";
	}
	
	public static void printChairmanName() {
		System.out.println("Naresh");
	}
	
	public Customer(String nam, char gend, int ag) {
		System.out.println("cons");
		name = nam;
		gender = gend;
		age = ag;
	}
	
	public Customer() {
		
	}

	public Customer(String nam, char gend) {
		name = nam;
		gender = gend;
	}
	
	
	
	public static void main(String[] args) {
		Customer.printChairmanName();
		System.out.println("main");
		//Customer c = new Customer("Naresh", 'm', 30);
		Customer c = new Customer("Naresh", 'M', 30);
		//Customer c = new Customer("Naresh", 'M');
		//System.out.println(c.name);//
		//System.out.println(c.gender);//
		//System.out.println(c.age);//
		//System.out.println(c);
		Customer c2 = new Customer("Nikita", 'F', 20);
		//System.out.println(c2);
		
		Customer c3 = new Customer("Surya", 'M', 50);
		//System.out.println(c3);
		//Customer.bankCode = "HC";
		//System.out.println(c);
		//System.out.println(c2);
		//System.out.println(c3);
		
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", gender=" + gender + ", age=" + age + ", mainBranchAddress="+mainBranchAddress+", bankName="+bankName+", bankCode="+bankCode+"]";
	}
	
	

}
