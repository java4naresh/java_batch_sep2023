package org.naresh.corejava.classobject;

public class Customer {
	
	String name;
	char gender;
	int age;
	
	/*public Customer(String nam, char gend, int ag) {
		name = nam;
		gender = gend;
		age = ag;
	}
	
	public Customer() {
		
	}

	public Customer(String nam, char gend) {
		name = nam;
		gender = gend;
	}*/
	
	
	
	public static void main(String[] args) {
		//Customer c = new Customer("Naresh", 'm', 30);
		Customer c = new Customer();
		//Customer c = new Customer("Naresh", 'M');
		//System.out.println(c.name);//
		//System.out.println(c.gender);//
		//System.out.println(c.age);//
		System.out.println(c);
	}
	
	

	public Customer(String name, char gender) {
		this.name = name;
		this.gender = gender;
	}

	public Customer() {
		
	}

	public Customer(String name, char gender, int age) {
		this.name = name;
		this.gender = gender;
		this.age = age;
	}

	public String toString() {
		return "CustomerDetails[name="+name+", gender="+gender+", age="+age+"]";
	}
	
	

}
