package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MainApp {
	
	public static void main(String[] args) {
		
    

		Configuration cfg = new Configuration();
		cfg.configure("hibernate.cfg.xml");
		SessionFactory factory = cfg.buildSessionFactory();
		
		Session session = factory.openSession();
		Transaction transaction = null;

		try {
			transaction = session.beginTransaction();
			
			// Create and set the Address object
			Address address = new Address();
			address.setStreet("Madan Bhandari");
			address.setCity("Bhaktapur");

			// Create and set the Person object
			Person person = new Person();
			person.setName("John Doe");
			person.setAddress(address);

			// Save the Person object, which cascades to saving the Address object
			session.save(person);

			transaction.commit();
			System.out.println("Data saved successfully.");
		} catch (Exception e) {
			if (transaction != null) {
				transaction.rollback();
			}
			e.printStackTrace();
		} finally {
			session.close();
		}
	}

}
