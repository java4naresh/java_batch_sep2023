package com.naresh.corejava.controller;

import java.util.ArrayList;
import java.util.List;

import com.naresh.corejava.service.StudentServiceProcessor;
import com.naresh.corejava.vo.Student;

public class StudentDetailsController {

	public static void main(String[] args) {
		Student s1 = new Student(1, "Naresh", 'M', 10);
		Student s2 = new Student(2, "Nikita", 'F', 10);
		Student s3 = new Student(3, "Surya", 'M', 10);
		Student s4 = new Student(4, "Krishna", 'M', 10);
		Student s5 = new Student(5, "Sita", 'F', 10);
		Student s6 = new Student(null, "Naresh", 'M', 10);
		Student s7 = new Student(6, null, 'M', 10);
		Student s8 = new Student(7, "Naresh", 'M', null);
		List<Student> studentDetails = new ArrayList<>();
		studentDetails.add(s1);
		studentDetails.add(s2);
		studentDetails.add(s3);
		studentDetails.add(s4);
		studentDetails.add(s5);
		studentDetails.add(s6);
		studentDetails.add(s7);
		studentDetails.add(s8);
		
		StudentServiceProcessor service = new StudentServiceProcessor();
		
		String result = service.studentDetailsValidateAndProcess(studentDetails);
		System.out.println(result);
	}

}
