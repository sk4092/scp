package com.swap.mavendemo.dao;

import java.sql.SQLException;
import java.util.List;

import com.swap.mavendemo.bean.Student;

public interface StudentDao {

	public boolean addStudent(Student student) throws SQLException;
	public Student getStudent(int studentId);
	public boolean updateStudent(Student student);
	public boolean deleteStudent(int studentId);
	public List<Student> getAllStudents();
}
