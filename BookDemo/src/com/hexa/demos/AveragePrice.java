package com.hexa.demos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.Book;


public class AveragePrice {
	public static void main(String args[]) {
	
			// TODO Auto-generated method stub
			Configuration cfg = new AnnotationConfiguration().configure();
			SessionFactory sfac = cfg.buildSessionFactory();
			Session sess = sfac.openSession();
			String hql="from Book b where bookPrice=(select avg(bookPrice) from Book)"; 
			Query qry=sess.createQuery(hql);
			Book b=(Book)qry.uniqueResult();
			System.out.println(b);
		  
	}

		
	  }

