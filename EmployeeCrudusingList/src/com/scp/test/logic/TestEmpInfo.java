package com.scp.test.logic;

import com.scp.bean.Address;
import com.scp.bean.Employee;
import com.scp.service.EmployeeService;
import com.scp.service.impl.EmployeeServiceImpl;

public class TestEmpInfo {

	public static void main(String[] args) throws Exception {
		Address ad1 = new Address(10121,"Pune","MH");
		Address ad2 = new Address(1231,"Mumbai","MH");
		Employee e1 = new Employee(1,"E1",1231231,ad1);
		Employee e2 = new Employee(2,"E2",31231,ad2);
		Employee e3 = new Employee(3,"E3",1231,ad1);
		
		EmployeeService service = new EmployeeServiceImpl();
		service.addEmployee(e1);
		service.addEmployee(e2);
		service.addEmployee(e3);
		
		System.out.println("EMP2 Values --"+service.getEmployee(2));
		System.out.println("All Values before update--"+service.getAllEmployees());
		
		e3.getEmpAddress().setCityName("XXXXXX");
		service.updateEmployee(e3);
		
		System.out.println("All Values after update--"+service.getAllEmployees());
		
		service.deleteEmployee(1);
		
		System.out.println("All Values delete-"+service.getAllEmployees());		
	}
	
}
