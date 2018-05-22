/*package com.scp.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

import com.scp.bean.Address;
import com.scp.bean.Employee;
import com.scp.dao.EmployeeDAO;
import com.scp.utilities.DatabaseUtility;

public class EmployeeDAOImpl implements EmployeeDAO{
	Connection connection;
	Statement statement;
	
	*//**
	 * 
CREATE TABLE employee_Info( 
 emp_id int NOT NULL,
  empName_name char(50) NOT NULL,
  emp_salary int,
  aid int NOT NULL
)


//insert into employee_Info values(1,'Abcd',1021,102121);
//insert into employee_Address values(102121,'Pune','MH');

aid=pin

CREATE TABLE employee_Address
( 
  aid int NOT NULL,
  city_name char(50) NOT NULL,
  state_name char(50),
);

	 * 
	 * 
	 * 
	 * insert into employee_Info values(1,'AAA',1212121,1212)
	 * insert into employee_Address values(1212,'Pune','MH')
	 *//*
	
	@Override
	public boolean addEmployee(Employee e) {
		try {
			connection = DatabaseUtility.getDatabaseConnection();
			Statement statement = connection.createStatement();
			statement.executeUpdate("insert into employee_Info values("+e.getEmpId()+",'"+e.getEmpName()+"',"+e.getEmpSalary()+","+e.getEmpAddress().getPinCode()+")");
			statement.executeUpdate("insert into employee_Address values("+e.getEmpAddress().getPinCode()+",'"+e.getEmpAddress().getCityName()+"','"+e.getEmpAddress().getStateName()+"')");
		} catch (Exception ex) {
			// TODO Auto-generated catch block
			ex.printStackTrace();
			return false;
		}
		
		return true;
	}

	@Override
	public Employee getEmployee(int empId) {
		Employee e = null;
		try{
			connection = DatabaseUtility.getDatabaseConnection();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from employee_info where emp_id="+empId);
			while(resultSet.next()){
				e = new Employee(
						resultSet.getInt("emp_id"), 
						resultSet.getString("empName_name"), 
						resultSet.getInt("emp_salary"), 
						new Address(resultSet.getInt("aid"), null, null));
			}
		}catch (Exception ex) {
			
		}
		return e;
	}

	@Override
	public boolean updateEmployee(Employee emp) {
		connection = DatabaseUtility.getDatabaseConnection();
		return false;
	}

	@Override
	public boolean deleteEmployee(int empId) {
		connection = DatabaseUtility.getDatabaseConnection();
		return false;
	}

	@Override
	public List<Employee> getAllEmployees() {
		connection = DatabaseUtility.getDatabaseConnection();
		return null;
	}

}
*/