package com.scp.QuestionSet.ImmutableClass.model;



public final class Student {
	
	private final int rollNumber = 10;
	private final String name ="Swapnil";
	private final Address address = Address.getAddress();
	
	private Student(){
		super();
	};
	
	@Override
	public String toString() {
		return "Student [rollNumber=" + rollNumber + ", name=" + name + ", address=" + address + "]";
	}

	public int getRollNumber() {
		return rollNumber;
	}
	public String getName() {
		return name;
	}
	public Address getAddress() {
		return address;
	}

	static Student getStudent(){
		return new Student();
	}
	
	

}
