package org.naresh.corejava.inheritence;

public class Holiday {

	public static void main(String[] args) {
		Car car = new Car("Mahindra", "XUV3oo", 18, "Aquamarine");
		Person naresh = new Person("Naresh",'M', car);
		naresh.goForLongDrive("Tirupathi");
		
		Person nikita = new Person("Nikita",'F', car);
		nikita.goForLongDrive("OOty");
	}

}
