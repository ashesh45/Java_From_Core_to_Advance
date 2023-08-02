package com.hibernate.onetoMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoManyExample {
	
	public static void main(String[] args) {
		Product pd1 = new Product("Laughing Buddha Idol", "Gold Plated Finish", 300f);
		Product pd2 = new Product("Saraswoti idol", "Gold Plated Finish", 700f);
		Product pd3 = new Product("Krishna Idol", "Jade Finish", 3000f);
		Category cat = new Category("statues");
		
		pd1.setCategory(cat);
		pd2.setCategory(cat);
		pd3.setCategory(cat);
		ArrayList<Product> products = new ArrayList<>();
		products.add(pd1);
		products.add(pd2);
		products.add(pd3);
		cat.setProducts(products);
		Configuration con = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd1);
		session.save(pd2);
		session.save(pd3);
		session.save(cat);
		tx.commit();
		session.close();
	}

}
