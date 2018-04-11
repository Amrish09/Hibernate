	package com.hexa.demos;

	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

	import com.hexa.entity.Book;

	public class DisplayBookWithPrice {

		public static void main(String[] args) {
			
				Configuration cfg = new AnnotationConfiguration().configure();
				SessionFactory sfac = cfg.buildSessionFactory();
				Session sess = sfac.openSession();
				String hql="from Book where bookPrice between :min and :max";
		        Query qry=sess.createQuery(hql);
		     
		        qry.setInteger("min", 500);
		        qry.setInteger("max", 2000);
		        List<Book> lst = qry.list();
				sess.close();
				lst.stream().forEach(System.out::println);
		}

	}


