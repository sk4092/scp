package com.swap.mavendemo.bean;

public class Student {
	
	private int rollNumber;
	private String studentName;
	private float percentage;
	
	
	
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int rollNumber, String studentName, float percentage) {
		super();
		this.rollNumber = rollNumber;
		this.studentName = studentName;
		this.percentage = percentage;
	}
	public int getRollNumber() {
		return rollNumber;
	}
	public void setRollNumber(int rollNumber) {
		this.rollNumber = rollNumber;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", studentName=" + studentName + ", percentage=" + percentage
				+ "]";
	}
	
	
	

}
