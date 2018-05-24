package com.scp.hibernate;

import java.util.List;

import org.hibernate.Session;

import com.scp.hibernate.model.Student;
import com.scp.hibernate.model.StudentWithMapping;
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
         StudentWithMapping student = new StudentWithMapping();
         
        student.setId(2);
        student.setName("Sahil Kumbhar");
         
         session.save(student);
         session.getTransaction().commit();
         
         List result = session.createCriteria(StudentWithMapping.class).list();
         
         for (Object object : result) {
        	 StudentWithMapping s = (StudentWithMapping) object;
			System.out.println(s.getName());
		}
    }
}
