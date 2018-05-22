package com.scp.service.impl;

import java.util.List;

import com.scp.bean.Employee;
import com.scp.dao.EmployeeDAO;
import com.scp.dao.impl.EmployeeDAOImplWithoutDB;
import com.scp.service.EmployeeService;

public class EmployeeServiceImpl implements EmployeeService{

	EmployeeDAO employeeDAO = new EmployeeDAOImplWithoutDB();
	
	@Override
	public boolean addEmployee(Employee emp) {
		return employeeDAO.addEmployee(emp);
	}

	@Override
	public Employee getEmployee(int empId) throws Exception {
		if(0==empId){
			throw new Exception("Invalid employee Id");
		}
		return employeeDAO.getEmployee(empId);
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		return employeeDAO.updateEmployee(emp);
	}

	@Override
	public boolean deleteEmployee(int empId) {
		return employeeDAO.deleteEmployee(empId);
	}

	@Override
	public List<Employee> getAllEmployees() {
		return employeeDAO.getAllEmployees();
	}

}
