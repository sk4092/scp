package com.scp.hibernateHbm2ddl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.scp.hibernateHbm2ddl.entity.StudentEntity;

/**
 * 
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       SessionFactory sf= new Configuration().configure().buildSessionFactory();
       Session session=sf.openSession();
       StudentEntity s =new StudentEntity(1, "Swapnil", 89.33F);
       StudentEntity s1 =new StudentEntity(1, "Swapnil", 89.33F);
       StudentEntity s2 =new StudentEntity(1, "Swapnil", 89.33F);
       
       session.beginTransaction();
       session.save(s);
       session.save(s1);
       session.save(s2);
       session.getTransaction().commit();
       session.close();
       sf.close();//if hbm2ddl property has value "create-drop" execution of this statement will drop the table
    }
}
