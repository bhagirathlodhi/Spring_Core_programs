package com.cls.hibernatecls;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Product_Copyy {
	public static void main(String[] args) {
       Configuration cfg = new Configuration();
       cfg.configure("hibernate.cfg.xml");
       SessionFactory sf=cfg.buildSessionFactory();
       Session ss = sf.openSession();
       Transaction tr = ss.beginTransaction();
       Query qu = ss.createQuery("insert into Product_Copyy(id,name,price)select p.id,p.name,p.price from Product p");
      int rows= qu.executeUpdate();
       tr.commit();
       System.out.println(rows+"number of rows Inserted");
       
	}

}
