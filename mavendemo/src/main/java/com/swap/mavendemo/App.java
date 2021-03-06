package com.swap.mavendemo;

import java.util.List;

import com.swap.mavendemo.bean.Student;
import com.swap.mavendemo.service.impl.StudentServiceImpl;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Student student1=new Student(1,"Swapnil",87.99F);
       Student student2=new Student(2,"Sahil",79.09F);
       Student student3=new Student(3,"Abhi",86.64F);
       Student student4=new Student(4,"Sagar",65.87F);
       
       
       
       StudentServiceImpl serviceimpl=new StudentServiceImpl();
       serviceimpl.addStudent(student1);
       serviceimpl.addStudent(student2);
       serviceimpl.addStudent(student3);
       serviceimpl.addStudent(student4);
       
       
       List<Student> students = serviceimpl.getAllStudents();
       System.out.println("All Students : -");
       printStudents(students);
       
       //Update students
       student3.setStudentName("Pranav");
       serviceimpl.updateStudent(student3);
       
       students = serviceimpl.getAllStudents();
       System.out.println("All Students After Updation: -");
       printStudents(students);
       
       //delete student
       serviceimpl.deleteStudent(student4.getRollNumber());
       
       students = serviceimpl.getAllStudents();
       System.out.println("All Students After Deletion: -");
       printStudents(students);
       
       
       //get by Roll Number
       Student studentForRollNummber = serviceimpl.getStudent(student1.getRollNumber());
       System.out.println("Student Found for Roll Number \n"+studentForRollNummber);
    }

	private static void printStudents(List<Student> students) {
		for (Student student : students) {
			System.out.println(student);
		}
		
	}
}
