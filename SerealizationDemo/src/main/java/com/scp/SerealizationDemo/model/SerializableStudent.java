package com.scp.SerealizationDemo.model;

import java.io.Serializable;

public class SerializableStudent implements Serializable{

	private int rollNumber;
	private int standard;
	public SerializableStudent(int rollNumber, int standard) {
		super();
		this.rollNumber = rollNumber;
		this.standard = standard;
	}
	@Override
	public String toString() {
		return "SerializableStudent [rollNumber=" + rollNumber + ", standard=" + standard + "]";
	}
}
