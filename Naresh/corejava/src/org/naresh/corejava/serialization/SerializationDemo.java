package org.naresh.corejava.serialization;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializationDemo {

	public static void main(String[] args) throws IOException {
		PrimeUser pu = new PrimeUser("naresh", "naresh");
		
		FileOutputStream fos = new FileOutputStream("D:\\files\\nikita\\primeuser.txt");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		oos.writeObject(pu);
		System.out.println("serialization completed");
		
	}

}
