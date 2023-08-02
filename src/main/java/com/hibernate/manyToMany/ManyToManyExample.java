package com.hibernate.manyToMany;

import java.util.ArrayList;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class ManyToManyExample {
	public static void main(String[] args) {
		Product pd1 = new Product("Laughing Buddha Idol", "Gold Plated Finish", 300f);
		Product pd2 = new Product("Saraswoti idol", "Gold Plated Finish", 700f);
		Product pd3 = new Product("Krishna Idol", "Jade Finish", 3000f);
		Category cat1 = new Category("statues");
		Category cat2 = new Category("decorativer");
		Category cat3 = new Category("gifts");
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(cat1);
		categories.add(cat2);
		categories.add(cat3);
		
		pd1.setCategories(categories);
		pd2.setCategories(categories);
		pd3.setCategories(categories);
		ArrayList<Product> products = new ArrayList<>();
		products.add(pd1);
		products.add(pd2);
		products.add(pd3);
		cat1.setProducts(products);
		cat2.setProducts(products);
		cat3.setProducts(products);
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
		session.save(cat1);
		session.save(cat2);
		session.save(cat3);
		tx.commit();
		session.close();
	}

}
