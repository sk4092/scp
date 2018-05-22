package com.scp.bean;

public class Address {
	
	private int pinCode;
	private String cityName;
	private String stateName;
	
	public Address(int pinCode, String cityName, String stateName) {
		super();
		this.pinCode = pinCode;
		this.cityName = cityName;
		this.stateName = stateName;
	}

	public int getPinCode() {
		return pinCode;
	}

	public void setPinCode(int pinCode) {
		this.pinCode = pinCode;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}

	public String getStateName() {
		return stateName;
	}

	public void setStateName(String stateName) {
		this.stateName = stateName;
	}

	@Override
	public String toString() {
		return "Address [pinCode=" + pinCode + ", cityName=" + cityName + ", stateName=" + stateName + "]";
	}
	
	
	
	
	
	
}
