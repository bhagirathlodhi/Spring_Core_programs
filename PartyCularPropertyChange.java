package com.cls.hibernatecls;

import java.util.Scanner;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class PartyCularPropertyChange {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		Query qu = ss.createQuery("update Product set price=:newPrice where id=:id");
		Transaction tr = ss.beginTransaction();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter product id:-");
		int uid=sc.nextInt();
		System.out.println("Enter Product Price:-");
		Double uprice=sc.nextDouble();
		qu.setParameter("id", uid);
		qu.setParameter("newPrice", uprice);
		
		int row = qu.executeUpdate();
		System.out.println("number of row is updated "+row);
		tr.commit();
		sf.close();
		ss.close();
	}

}
