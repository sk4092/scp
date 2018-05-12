package com.scp.SerealizationDemo.model;

public class Student {

	private int rollNumber;
	private int standard;
	public Student(int rollNumber, int standard) {
		super();
		this.rollNumber = rollNumber;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "SerializableStudent [rollNumber=" + rollNumber + ", standard=" + standard + "]";
	}
}
