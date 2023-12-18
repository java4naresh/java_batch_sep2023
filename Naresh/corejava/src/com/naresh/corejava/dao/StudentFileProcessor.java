package com.naresh.corejava.dao;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.naresh.corejava.vo.Student;

public class StudentFileProcessor {
	
	public String studentDetailsProcess(List<Student> studentDetails) {
		try {
			File myFile = new File("D:\\files\\nikita\\student.txt");
			PrintWriter writer = new PrintWriter(myFile);
			for(Student student: studentDetails) {
				writer.write(student.getStudentId()+"-"+student.getStudentName()+"-"+student.getGender()+"-"+student.getGrade());
				writer.println();
			}
			writer.flush();
			return "Student Details Processed Successfully";
		} catch(IOException ioe) {
			return "Student Details not Processed Successfully";
		}
		
	}

}
