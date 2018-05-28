package com.scp.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.scp.hibernate.model.StudentWithMapping;

public class UpdateVsMerge {

	public static void main(String[] args) {
		Session session = new Configuration().configure().buildSessionFactory().openSession();
		Transaction tr = session.beginTransaction();
		StudentWithMapping s = new StudentWithMapping(1235,"Swapnil");
		session.save(s);
		tr.commit();
		session.close();
		
		
		Session session2 =  new Configuration().configure().buildSessionFactory().openSession();
		StudentWithMapping dbs1 = session2.get(StudentWithMapping.class, 1235);
		//session2.update(s);//Throw an exception org.hibernate.NonUniqueObjectException: A different object with the same identifier value was already associated with the session : [com.scp.hibernate.model.StudentWithMapping#1234]
		session2.merge(s);//will not throw any exception 
		
	}
}
