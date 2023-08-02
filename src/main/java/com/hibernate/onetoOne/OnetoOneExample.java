package com.hibernate.onetoOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OnetoOneExample {
	public static void main(String[] args) {
		Product pd = new Product("Laughing Buddha Idol", "Gold Plated Finish", 300f);
		Category cat = new Category("statues");
		cat.setProduct(pd);
		pd.setCategory(cat);
		Configuration con = new Configuration()
								.configure()
								.addAnnotatedClass(Product.class)
								.addAnnotatedClass(Category.class);
		SessionFactory sf = con.buildSessionFactory();
		Session session = sf.openSession();
		Transaction tx = session.beginTransaction();
		session.save(pd);
		session.save(cat);
		tx.commit();
		session.close();
	}

}
