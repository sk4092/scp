package com.scp.SerealizationDemo.model;

import java.io.Serializable;

public class SeriaziableStudentWithTransientStatic implements Serializable{

	transient static private int rollNumber;
	private int standard;
	public SeriaziableStudentWithTransientStatic(int rollNumber, int standard) {
		super();
		this.rollNumber = rollNumber;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "SerializableStudent [rollNumber=" + rollNumber + ", standard=" + standard + "]";
	}
}
