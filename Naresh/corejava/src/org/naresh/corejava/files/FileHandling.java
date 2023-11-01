package org.naresh.corejava.files;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandling {

	public static void main(String[] args) {
		
		//FileHandling.createNewFile("D:\\files\\nikita\\sample.txt");
		//FileHandling.writeDataIntoFile("D:\\files\\nikita\\sample.txt", "Hello Nikita");
		
		FileHandling.readDataFromFile("D:\\files\\nikita\\sample2.txt");
	}
	
	public static void readDataFromFile(String path) {
		try {
			File myFile = new File(path);
			FileReader reader = new FileReader(myFile);
			int ch = reader.read();
			while(ch!=-1) {
				System.out.print((char)ch);
				ch = reader.read();
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
	
	public static void writeDataIntoFile(String path, String msg) {
		try {
			File myFile = new File(path);
			FileWriter writer = new FileWriter(myFile);
			writer.write(msg);
			writer.flush();
			System.out.println("Data written successfully");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}
	
	public static void createNewFile(String path) {
		try {
			File myFile = new File(path);
			boolean fileStatus = myFile.createNewFile();
			if(fileStatus) {
				System.out.println("File is created");
			} else {
				System.out.println("File is not created");
			}
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}

}
