package com.cls.hibernatecls;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainAvg {
	public static void main(String[] args) {
	       Configuration cfg = new Configuration();
	       cfg.configure();
	       SessionFactory sf=cfg.buildSessionFactory();
	       Session ss = sf.openSession();
	       Transaction tr = ss.beginTransaction();
	       Query qu = ss.createQuery("select sum(p.price),avg(p.price),max(p.price) from Product p");
	
	List ls = qu.list();
	
	
	Object obj[] = (Object[])ls.get(0);
	
	System.out.println("total product prie is "+obj[0]);
	System.out.println("avg product prie is "+obj[1]);
	System.out.println("max product prie is "+obj[2]);
	}
	
}
