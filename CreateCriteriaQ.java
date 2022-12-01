package com.cls.hibernatecls;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class CreateCriteriaQ {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Criteria cr = ss.createCriteria(Product.class);
		
		List<Product> ls = cr.list();
		// by using for each loop
		for(Product prod: ls)
		{
			System.out.println(prod.getPid()+"  "+prod.getPname()+"  "+prod.getPrice());
		}
		
	// By using Iterator 	
//		Iterator it =ls.iterator();
//		while(it.hasNext())
//		{
//			Product pp = (Product)it.next();
//			System.out.println(pp+"  ");
//		}
	}

}
