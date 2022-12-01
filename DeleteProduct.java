package com.cls.hibernatecls;

import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class DeleteProduct {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Query qu = ss.createQuery("delete Product  where id=:id");
		Transaction tr = ss.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id:-");
		int uid=sc.nextInt();
		qu.setParameter("id", uid);
		
		int row = qu.   executeUpdate();
		System.out.println("number of row is Deleted "+row);
		tr.commit();
		sf.close();
		ss.close();
	}

}
