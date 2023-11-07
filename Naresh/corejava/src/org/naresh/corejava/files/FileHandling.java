package org.naresh.corejava.files;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class FileHandling {

	public static void main(String[] args) {
		
		//FileHandling.createNewFile("D:\\files\\nikita\\sample.txt");
		//FileHandling.writeDataUsingBufferedWriter("D:\\files\\nikita\\sample.txt", "Hello Nikita");
		
		//FileHandling.readDataFromFile("D:\\files\\nikita\\sample2.txt");
		//FileHandling.readDataUsingBufferedReader("D:\\files\\nikita\\sample2.txt");
		FileHandling.writeDataUsingPrintWriter("D:\\files\\nikita\\sample.txt", "Facebook registration");
	}
	
	public static void readDataUsingBufferedReader(String path) {
		try {
			File myFile = new File(path);
			BufferedReader reader = new BufferedReader(new FileReader(myFile));
			String line = reader.readLine();
			while(line != null) {
				System.out.println(line);
				line = reader.readLine();
			}
		} catch(IOException ioe) {
			ioe.printStackTrace();
		}
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
			writer.write("\n");
			writer.write(msg);
			writer.flush();
			System.out.println("Data written successfully");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}
	
	public static void writeDataUsingPrintWriter(String path, String msg) {
		try {
			File myFile = new File(path);
			PrintWriter writer = new PrintWriter(myFile);
			writer.write(msg);
			writer.println();
			writer.write("Naresh Kambala");
			writer.println();
			writer.print(30);
			writer.println();
			writer.print('M');
			writer.println();
			writer.print(9951288766l);
			writer.println();
			writer.print(false);
			writer.flush();
			System.out.println("Data written successfully");
			} catch(IOException ioe) {
				ioe.printStackTrace();
			}
	}
	
	public static void writeDataUsingBufferedWriter(String path, String msg) {
		try {
			File myFile = new File(path);
			BufferedWriter bw = new BufferedWriter(new FileWriter(myFile));
			bw.write(msg);
			bw.newLine();
			bw.write(msg);
			bw.flush();
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
