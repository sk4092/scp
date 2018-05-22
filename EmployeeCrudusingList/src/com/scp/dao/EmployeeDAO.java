package com.scp.dao;

import java.util.List;

import com.scp.bean.Employee;

public interface EmployeeDAO {

	public boolean addEmployee(Employee emp);
	public Employee getEmployee(int empId);
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int empId);
	public List<Employee> getAllEmployees();

}
