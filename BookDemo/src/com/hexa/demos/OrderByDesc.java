package com.hexa.demos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class OrderByDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration cfg = new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		Session sess = sfac.openSession();
		String hql = "select book_name,book_id,book_price,category from BookDetails order by book_price desc";
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
