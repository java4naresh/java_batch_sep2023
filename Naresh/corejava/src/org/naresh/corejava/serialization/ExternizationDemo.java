package org.naresh.corejava.serialization;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ExternizationDemo {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Order order = new Order("Mobile Order", "Hyderabad", 1, "mobile", "IPhone");
		FileOutputStream fos = new FileOutputStream("D:\\files\\nikita\\order.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(order);
		System.out.println("serialization completed");
		
		FileInputStream fis = new FileInputStream("D:\\files\\nikita\\order.txt");
		ObjectInputStream ois = new ObjectInputStream(fis);
		Object obj = ois.readObject();
		Order order2  = (Order)obj;
        System.out.println(order2);

	}

}
