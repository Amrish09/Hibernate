package com.hexa.demos;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class BookTable {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		System.out.println("table created");
	}

}
