package com.scp.service;

import java.util.List;

import com.scp.bean.Employee;

/***
 * 
 *
 */
public interface EmployeeService {
	public boolean addEmployee(Employee emp);
	public Employee getEmployee(int empId) throws Exception;
	public boolean updateEmployee(Employee emp);
	public boolean deleteEmployee(int empId);
	public List<Employee> getAllEmployees();
}
