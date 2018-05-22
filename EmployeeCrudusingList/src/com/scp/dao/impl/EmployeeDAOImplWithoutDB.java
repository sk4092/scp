package com.scp.dao.impl;

import java.util.ArrayList;
import java.util.List;

import com.scp.bean.Employee;
import com.scp.dao.EmployeeDAO;

public class EmployeeDAOImplWithoutDB implements EmployeeDAO{
	List<Employee> listOfEmps = new ArrayList<>();
	
	
	@Override
	public boolean addEmployee(Employee emp) {
		return listOfEmps.add(emp);
	}

	@Override
	public Employee getEmployee(int empId) {
		for (Employee employee : listOfEmps) {
			if(empId==employee.getEmpId()){
				return employee;
			}
		}
		return null;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		for (Employee employee : listOfEmps) {
			if(emp.getEmpId()==employee.getEmpId()){
				employee.setEmpName(emp.getEmpName());
				employee.setEmpSalary(emp.getEmpSalary());
				employee.setEmpAddress(emp.getEmpAddress());
				break;
			}
		}
		return true;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		for(int i=0;i<listOfEmps.size();i++) {
			if(listOfEmps.get(i).getEmpId()==empId){
				listOfEmps.remove(i);
				break;
			}
		}
		return true;
	}

	@Override
	public List<Employee> getAllEmployees() {
		return listOfEmps;
	}

}
