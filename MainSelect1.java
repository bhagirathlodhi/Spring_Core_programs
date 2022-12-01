package com.cls.hibernatecls;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
/* fatch the data those user want to see*/
public class MainSelect1 {
	public static void main(String[] args) {
		Configuration cf = new Configuration();
		cf.configure();
		SessionFactory sf = cf.buildSessionFactory();
		Session ss = sf.openSession();
		//Query qu = ss.createQuery(" from Product where id=:id");
		Query qu = ss.createQuery(" from Product where price>=:price");
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter product id:-");
//		int uid=sc.nextInt();
		qu.setParameter("price",10000.0);
		
		//qu.getParameter()
		List<Product> ls = qu.list();
	//	try {
		for(int i=0;i<ls.size();i++){
			
		
			Product pd =ls.get(0);
			System.out.println(pd.getPid()+" "+pd.getPname()+"  "+pd.getPrice());
		}
//		}
//		catch(Exception e)
//		{
//			System.out.println("this id is not exist");
//		}
			
		}

}
