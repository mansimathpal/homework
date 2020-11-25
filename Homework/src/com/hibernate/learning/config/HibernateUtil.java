package com.hibernate.learning.config;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	
	public static SessionFactory getSessionFactory() {
		Configuration con = new Configuration();
		con.configure();
		SessionFactory sessionFactory= con.buildSessionFactory();
		
		return sessionFactory;
	}

}
