package com.swap.mavendemo.service.impl;

import java.util.List;

import com.swap.mavendemo.bean.Student;
import com.swap.mavendemo.dao.impl.StudentDaoImpl;
import com.swap.mavendemo.service.StudentService;

public class StudentServiceImpl implements StudentService {

	StudentDaoImpl daoImpl=new StudentDaoImpl();
	public boolean addStudent(Student student) {
		return daoImpl.addStudent(student);
	}

	public Student getStudent(int studentId) {
		return daoImpl.getStudent(studentId);
	}

	public boolean updateStudent(Student student) {
		return daoImpl.updateStudent(student);
	}

	public boolean deleteStudent(int studentId) {
		return daoImpl.deleteStudent(studentId);
	}

	public List<Student> getAllStudents() {
		return daoImpl.getAllStudents();
	}

}
