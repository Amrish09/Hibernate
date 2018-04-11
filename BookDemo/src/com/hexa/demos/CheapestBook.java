package com.hexa.demos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.Book;

public class CheapestBook {

	public static void main(String[] args) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session sess = sfac.openSession();
		String hql="from Book b1 where bookPrice=(select min(bookPrice) from Book where category= b1.category)";
		Query qry=sess.createQuery(hql);
		 List<Book> lst =qry.list();
		 lst.stream().forEach(System.out::println);
	}
}
