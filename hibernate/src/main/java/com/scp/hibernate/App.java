package com.scp.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.scp.hibernate.model.Student;
import com.scp.hibernate.util.HibernateUtil;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	 
         Session session = HibernateUtil.getSessionFactory().openSession();
         
         session.beginTransaction();
        Student student = new Student();
         
        student.setId(2);
        student.setName("Sahil Kumbhar");
         
         session.save(student);
         session.getTransaction().commit();
         
         List result = session.createCriteria(Student.class).list();
         
         for (Object object : result) {
			Student s = (Student) object;
			System.out.println(s.getName());
		}
    }
}
