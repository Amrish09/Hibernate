package com.hexa.demos;

	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

	import com.hexa.entity.Book;

	public class DisplayBookWithCategory {
	public static void main(String args[]) {
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session sess = sfac.openSession();
		String hql="from Book where category =?"; 
		Query qry=sess.createQuery(hql);
	    qry.setParameter(0,"motivational");
	    List<Book> lst = qry.list();
		sess.close();
		lst.stream().forEach(System.out::println);
	}
	}


