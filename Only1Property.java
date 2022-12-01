package com.cls.hibernatecls;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Projection;
import org.hibernate.criterion.ProjectionList;
import org.hibernate.criterion.Projections;
import org.hibernate.criterion.Restrictions;

public class Only1Property {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		SessionFactory sf = cfg.buildSessionFactory();
		Session ss = sf.openSession();
		
		Criteria cr = ss.createCriteria(Product.class);
		
//		cr.add(Restrictions.gt("price",5000.0));
//		cr.setProjection(Projections.property("price"));
	//	cr.setProjection(Projections.property("pname"));
	//	List<String> ls = cr.list();
//		for (String name : ls) {
//			System.out.println(name);
//		}
		
		ProjectionList pl  = Projections.projectionList();
		pl.add(Projections.property("pname"));
		pl.add(Projections.property("price"));
		cr.setProjection(pl);
		List ls = cr.list();
		for(Object ob:ls)
		{
		  Object[] obj=(Object [])ob;
		  System.out.println(obj[0]+""+obj[1]);
		  
		}

	}

}
