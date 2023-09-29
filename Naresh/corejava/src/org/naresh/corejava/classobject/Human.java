package org.naresh.corejava.classobject;

//import statements

public class Human {
	
	String name;
	char gender;
	int age;
	double height;
	double weight;
	String color;
	
	public void awakeTimeAndPrint(double wakeupTime) {
		System.out.println(name+" will wake up at "+wakeupTime+" regulary");
	}
	
	public String designation(String designation) {
		return name+" is a "+ designation;
	}
	
	public String annualIncome(double income) {
		return name+"'s annual income is "+income;
	}
	
	public static void main(String[] args) {
		Human naresh = new Human();
		/*System.out.println(naresh.name);
		System.out.println(naresh.gender);
		System.out.println(naresh.age);
		System.out.println(naresh.height);
		System.out.println(naresh.weight);
		System.out.println(naresh.color);
		System.out.println("====================");*/
	    naresh.name="Naresh";
		naresh.gender='M';
		naresh.age=30;
		naresh.height=5.8;
		naresh.weight=75;
		naresh.color="white";
		naresh.awakeTimeAndPrint(6.25);//calling
		String deisignation = naresh.designation("Software Engineer");//calling
		System.out.println(deisignation);
		/*System.out.println(naresh.name);
		System.out.println(naresh.gender);
		System.out.println(naresh.age);
		System.out.println(naresh.height);
		System.out.println(naresh.weight);
		System.out.println(naresh.color);
		System.out.println("====================");*/
		Human surya = new Human();
		/*System.out.println(surya.name);
		System.out.println(surya.gender);
		System.out.println(surya.age);
		System.out.println(surya.height);
		System.out.println(surya.weight);
		System.out.println(surya.color);
		System.out.println("====================");*/
		surya.name="Surya";
		surya.age = 50;
		surya.color = "White";
		surya.gender = 'M';
		surya.height = 5.6;
		surya.weight = 80.5;
		surya.awakeTimeAndPrint(6);
		System.out.println(surya.designation("Film Actor"));
		String annualIncomeOfSurya = surya.annualIncome(500000000.00);
		System.out.println(annualIncomeOfSurya);
		/*System.out.println(surya.name);
		System.out.println(surya.gender);
		System.out.println(surya.age);
		System.out.println(surya.height);
		System.out.println(surya.weight);
		System.out.println(surya.color);*/
	}

}
