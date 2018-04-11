package com.hexa.demos;

import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.dao.FlightDaoImpl;
import com.hexa.entity.BookingDetails;
import com.hexa.entity.FlightSchedule;

public class GetBookingDetails {
	private static SessionFactory sfac;
    static {
    	Configuration cfg = new AnnotationConfiguration();
		cfg.configure();
	    sfac = cfg.buildSessionFactory();
    }
	public static void main(String[] args) {
		
		FlightDaoImpl dao= new FlightDaoImpl();
		
		BookingDetails b = dao.getDetails(200);
		System.out.println(b);
		
	}
}
