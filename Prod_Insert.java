 package com.cls.hibernatecls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Prod_Insert {
	
	public static void main( String[] args )
    {
    	 Product p =new Product();
         p.setPid(31);
         p.setPname("Pen");
         p.setPrice(98.23);
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss = sf.openSession();
        
        Transaction tr = ss.beginTransaction();
        ss.save(p);
        tr.commit();
        ss.close();
        sf.close();
        System.out.println("data saved");
    }
}
