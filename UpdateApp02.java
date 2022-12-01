package com.cls.hibernatecls;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class UpdateApp02 {
	public static void main(String[] args) {

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		Student st = new Student();
		
		
		st.setId(2);
		st.setName("Abhilash");
		st.setPer(89.23);
		
		
		Transaction tr = ss.beginTransaction();
		ss.update(st);
		tr.commit();
		ss.close();
		sf.close();
		System.out.println("data updated successfully");
	}

}
