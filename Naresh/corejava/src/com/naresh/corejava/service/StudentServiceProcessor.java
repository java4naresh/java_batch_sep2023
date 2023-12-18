package com.naresh.corejava.service;

import java.util.ArrayList;
import java.util.List;

import com.naresh.corejava.dao.StudentFileProcessor;
import com.naresh.corejava.vo.Student;

public class StudentServiceProcessor {
	
	private StudentFileProcessor fileProcessor = new StudentFileProcessor();
	
	public String studentDetailsValidateAndProcess(List<Student> studentDetails) {
		
		List<Student> validStudentDetails = validateStudentDetails(studentDetails);
		
		return fileProcessor.studentDetailsProcess(validStudentDetails);
	}

	private List<Student> validateStudentDetails(List<Student> studentDetails) {
		List<Student> validData = new ArrayList<>();
		Boolean flag = true;
		for(Student student: studentDetails) {
			flag = true;
			if(student.getStudentId() == null) flag = false;
			else if(student.getStudentName() == null) flag = false;
			else if(student.getGender() == null) flag = false;
			else if(student.getGrade() == null) flag = false;
			if(flag) validData.add(student);
		}
		return validData;
	}

}
