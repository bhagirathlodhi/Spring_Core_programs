package com.cls.hibernatecls;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SingleProperty {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Query qu = ss.createQuery("select p.pname from Product p");
		List ls = qu.list();
		// Retrieve the String type data from database
		for (Object obj : ls) {

			System.out.println(obj);
		}

	}

}
