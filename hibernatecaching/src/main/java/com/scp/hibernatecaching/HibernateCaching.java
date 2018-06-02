package com.scp.hibernatecaching;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.hibernatecaching.entity.StudentEntity;

public class HibernateCaching {
	public static void main(String[] args) {
		SessionFactory factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		StudentEntity s1 = new StudentEntity(1, "Swapnil", 96.98F);
		StudentEntity s2 = new StudentEntity(2, "Amol", 96.98F);
		StudentEntity s3 = new StudentEntity(3, "Swapnil", 96.98F);
		
		session.beginTransaction();
		session.save(s1);
		session.save(s2);
		session.save(s3);
		session.getTransaction().commit();
		
		System.out.println("\nbefore-- First level cache");
		session.get(StudentEntity.class, 1);
		System.out.println("After-- First level cache");
		session.close();

		Session session2 = factory.openSession();
		System.out.println("\nbefore-- Second level cache");
		session2.get(StudentEntity.class, 1);
		System.out.println("After-- Second level cache");
		session2.close();
		
		Session session3 = factory.openSession();
		System.out.println("\nBefore - Query cache First Call");
		Query q = session3.createQuery("from StudentEntity where name = :username");
		q.setParameter("username", "Swapnil");
		q.list();
		System.out.println("After - Query cache First Call");
		
		System.out.println("\nBefore - Query cache Second Call");
		Query q2 = session3.createQuery("from StudentEntity where name = :username");
		q2.setParameter("username","Swapnil");
		q2.list();
		System.out.println("After - Query cache Second Call");
		
		session3.close();
		
		factory.close();

	}
}
