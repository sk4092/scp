package com.swap.mavendemo.dao.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


import com.swap.mavendemo.bean.Student;
import com.swap.mavendemo.dao.StudentDao;
import com.swap.mavendemo.utilities.DatabaseUtility;

public class StudentDaoImpl implements StudentDao{
	Connection connection=null;
	Statement statement;

	public boolean addStudent(Student student) {
		connection = DatabaseUtility.getDatabaseConnection();
		try {
			statement = connection.createStatement();
			statement.executeUpdate("insert into student_Info values("+student.getRollNumber()+",'"+student.getStudentName()+"',"+student.getPercentage()+")");
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
		
	}

	public Student getStudent(int studentId) {
		Student s=null;
		try{
			connection = DatabaseUtility.getDatabaseConnection();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student_info where rollNumber = " + studentId);
			while(resultSet.next()){
				s = new Student(
						resultSet.getInt("rollNumber"), 
						resultSet.getString("name"), 
						resultSet.getFloat("percentage"));
			}
		}catch (Exception ex) {
			
		}
		return s;
	}

	public boolean updateStudent(Student student) {
		connection = DatabaseUtility.getDatabaseConnection();
		try {
			statement = connection.createStatement();
			statement.executeUpdate("update student_Info set name='"+student.getStudentName()+"' where rollNumber = "+student.getRollNumber());
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public boolean deleteStudent(int studentId) {
		connection = DatabaseUtility.getDatabaseConnection();
		try {
			statement = connection.createStatement();
			statement.executeUpdate("delete from student_Info where rollNumber = "+studentId);
			return true;
		} catch (SQLException e) {
			e.printStackTrace();
			return false;
		}
	}

	public List<Student> getAllStudents() {
		List<Student> students = new ArrayList();
		try{
			connection = DatabaseUtility.getDatabaseConnection();
			statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from student_info");
			while(resultSet.next()){
				Student s = new Student(
						resultSet.getInt("rollNumber"), 
						resultSet.getString("name"), 
						resultSet.getFloat("percentage"));
				students.add(s);
			}
		}catch (Exception ex) {
			
		}
		return students;
	}

}
