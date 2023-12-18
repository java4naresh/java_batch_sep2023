package com.naresh.corejava.vo;

public class Student {
	private Integer studentId;
	private String studentName;
	private Character gender;
	private Integer grade;
	public Student(Integer studentId, String studentName, Character gender, Integer grade) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.gender = gender;
		this.grade = grade;
	}
	public Student() {
		super();
	}
	public Integer getStudentId() {
		return studentId;
	}
	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public Character getGender() {
		return gender;
	}
	public void setGender(Character gender) {
		this.gender = gender;
	}
	public Integer getGrade() {
		return grade;
	}
	public void setGrade(Integer grade) {
		this.grade = grade;
	}
	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", gender=" + gender + ", grade="
				+ grade + "]";
	}
	

}
