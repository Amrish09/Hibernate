package com.hexa.dao;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.Book;


public class BookImpl implements IDao{
	private static SessionFactory sfac;
	static {
		Configuration cfg=new AnnotationConfiguration().configure();
		sfac = cfg.buildSessionFactory();
	}
	@Override
	public int addBook(Book b) {
		Session sess= null;
		Transaction tx= null;
	try {
		sess= sfac.openSession();
		tx = sess.beginTransaction();
		sess.save(b);
		tx.commit();
		return 1;
		
	}catch(HibernateException ex) {
		System.out.println(ex.getMessage());
		if(tx!= null)
			tx.rollback();
		
	}finally {
		if(sess!= null) 
			sess.close();
	 }
	return 0;
 }

}
