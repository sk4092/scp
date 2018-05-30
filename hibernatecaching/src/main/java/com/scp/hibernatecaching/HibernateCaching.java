package com.scp.hibernatecaching;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.hibernatecaching.entity.StudentEntity;

public class HibernateCaching {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		StudentEntity s = new StudentEntity(3, "Mandira", 96.98F);
		session.beginTransaction();
		session.save(s);
		session.getTransaction().commit();

		System.out.println("before-- First level cache");
		session.get(StudentEntity.class, 3);
		System.out.println("After-- First level cache");
		session.close();

		Session session2 = factory.openSession();
		System.out.println("before-- Second level cache");
		session2.get(StudentEntity.class, 3);
		System.out.println("After-- Second level cache");
		
		session2.close();
		factory.close();

	}
}
