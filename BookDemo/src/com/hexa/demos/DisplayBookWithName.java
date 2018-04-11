package com.hexa.demos;
	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

import com.hexa.entity.Book;



	public class DisplayBookWithName {
		public static void main(String args[]) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session sess = sfac.openSession();
		String hql="from Book where bookName like ?";
	    Query qry=sess.createQuery(hql);
	     qry.setString(0,"The tale of two cities");
	     Book b = (Book)qry.uniqueResult();
	   System.out.println(b);
	}
	}


