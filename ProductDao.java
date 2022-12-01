/*package com.cls.hibernatecls;

import java.util.Scanner;


import javax.transaction.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class ProductDao {
	private static Scanner sc;
	private static Session ss;
	static {
		sc = new Scanner(System.in);
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		ss = sf.openSession();
	}

	void insertProduct()
		{
			System.out.println("enter the product id ,name & price");
			Product p=new Product();
			p.setPid(sc.nextInt());
			p.setPname(sc.next());
			p.setPrice(sc.nextDouble());
			
			try
			{
				
			
			org.hibernate.Transaction tr =ss.beginTransaction();
			ss.save(p);
			tr.commit();
		}
			}

}*/
