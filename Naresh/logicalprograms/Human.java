class Human 
{
	String name;
	char gender;
	int age;
	double height;
	double weight;
	String color;

	public static void main(String[] args) {
	
	Human naresh = new Human();
	System.out.println(naresh.name);
	System.out.println(naresh.gender);
	System.out.println(naresh.age);
	System.out.println(naresh.height);
	System.out.println(naresh.weight);
	System.out.println(naresh.color);
    naresh.name="Naresh";
	naresh.gender='M';
	naresh.age=30;
	naresh.height=5.8;
	naresh.weight=75;
	naresh.color="white";
	System.out.println(naresh.name);
	System.out.println(naresh.gender);
	System.out.println(naresh.age);
	System.out.println(naresh.height);
	System.out.println(naresh.weight);
	System.out.println(naresh.color);
	
	}

}