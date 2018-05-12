package com.scp.QuestionSet.ImmutableClass.model;

public class Address {
	
	private String city = "Pune";

	private Address() {
		super();
	}

	public String getCity() {
		return city;
	}
	
	static Address getAddress(){
		return new Address();
	}

	@Override
	public String toString() {
		return "Address [city=" + city + "]";
	}

	
}
