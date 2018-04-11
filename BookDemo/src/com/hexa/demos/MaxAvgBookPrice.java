

	package com.hexa.demos;

	import java.util.List;

	import org.hibernate.Query;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.cfg.AnnotationConfiguration;
	import org.hibernate.cfg.Configuration;

	public class MaxAvgBookPrice {

		public static void main(String[] args) {
			// TODO Auto-generated method stub
			Configuration cfg = new AnnotationConfiguration().configure();
			SessionFactory sfac = cfg.buildSessionFactory();
			Session sess = sfac.openSession();
			String hql = "select category,avg(bookPrice),min(bookPrice),avg(bookPrice) from Book group by category";
			Query qry = sess.createQuery(hql);
			List<Object[]> lst = qry.list();
			sess.close();
			lst.forEach(arr -> {
				System.out.println(arr[0]);
				System.out.println(arr[1]);
				System.out.println(arr[2]);
				System.out.println(arr[3]);
			});

		}
	}


