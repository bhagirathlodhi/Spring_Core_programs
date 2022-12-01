package com.cls.hibernatecls;

import org.hibernate.Session;

import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
    	 Student st = new Student();
         st.setId(22);
         st.setName("bhagirath Lodhi");
         st.setPer(65.12);
        Configuration cfg = new Configuration();
        
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf=cfg.buildSessionFactory();
        Session ss = sf.openSession();
        
        Transaction tr = ss.beginTransaction();
        ss.save(st);
        tr.commit();
        ss.close();
        sf.close();
        System.out.println("data saved");
        
    		   
    }
}
