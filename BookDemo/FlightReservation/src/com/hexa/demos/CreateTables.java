package com.hexa.demos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.CustomerDetails;
import com.hexa.entity.FlightSchedule;

public class CreateTables {

	public static void main(String[] args) {
		Configuration cfg=new AnnotationConfiguration().configure();
		SessionFactory sfac = cfg.buildSessionFactory();
		System.out.println("table created");

	}

}