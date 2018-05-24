package com.scp.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.hibernate.model.Student;
import com.scp.hibernate.util.HibernateUtil;

public class GetVsLoadDemo {
	
	public static void main(String[] args) {
		
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session= sessionFactory.openSession();
		
		session.beginTransaction();
		Student s1= new Student(101, "Amol");
		Student s2 = new Student(102,"Abhi");
		
		session.save(s1);
		session.save(s2);
		session.getTransaction().commit();
		
		System.out.println("Before Get");
		Student dbs1 = session.get(Student.class, 101);
		System.out.println("After Get");
		
		System.out.println("Before Load");
		Student dbs2 = session.load(Student.class, 102);
		System.out.println("After Load");
		
		
		System.out.println(dbs1);
		System.out.println(dbs2);
	}

}
