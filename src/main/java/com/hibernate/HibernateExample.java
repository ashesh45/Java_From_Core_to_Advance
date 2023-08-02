package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateExample {
	public static void main(String[] args) {
		Product pd = new Product("Laughing Buddha Idol", "Gold Plated Finish", 300f);
		Configuration con = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd);
		tx.commit();
		session.close();
		
		
		
	}

}
