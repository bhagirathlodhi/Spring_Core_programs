package com.cls.hibernatecls;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HqlQ {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Query qu = ss.createQuery("select p.pname,p.price from Product p");
		List ls = qu.list();
		for (Object obj : ls) {
			Object[] p = (Object[]) obj;
			System.out.println(p[0] + ",," + p[1]);

		}
	}
	 
}
