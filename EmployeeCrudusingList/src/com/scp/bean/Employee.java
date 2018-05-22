package com.scp.bean;

public class Employee {
	private int empId;
	private String empName;
	private int empSalary;
	private Address empAddress;
	
	/**
	 * @author Yogesh
	 * @param empId
	 * @param empName
	 * @param empSalary
	 * @param empAddress
	 */
	public Employee(int empId, String empName, int empSalary, Address empAddress) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSalary = empSalary;
		this.empAddress = empAddress;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpSalary() {
		return empSalary;
	}

	public void setEmpSalary(int empSalary) {
		this.empSalary = empSalary;
	}

	public Address getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(Address empAddress) {
		this.empAddress = empAddress;
	}

	@Override
	public String toString() {
		return "\nEmployee [empId=" + empId + ", empName=" + empName + ", empSalary=" + empSalary + ", empAddress="
				+ empAddress + "]";
	}
	
}
