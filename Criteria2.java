package com.cls.hibernatecls;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;

public class Criteria2 {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria cr = ss.createCriteria(Product.class);
		//Criteria cr = ss.createCriteria(Product.class);// ge() is used to fatch graterthan value & le() is used to fatch
														// less value form the database
		//Criterion cri = Restrictions.and(Restrictions.ge("price", 3000.0), Restrictions.le("price", 50000.0));
		// Criterion cri= Restrictions.lt("price",5003.0);
		Criterion cri = Restrictions.and(Restrictions.like("pname", "%n%"));
		cr.add(cri);
		cr.addOrder(Order.desc("price"));
		List<Product> ls = cr.list();
		for (Product prod : ls) {
			System.out.println(prod.getPid() + "  " + prod.getPname() + "  " + prod.getPrice());
		}

	}
}
