package com.hexa.demos;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.dao.FlightDaoImpl;
import com.hexa.entity.FlightSchedule;

public class GetSchedule {
	private static SessionFactory sfac;
    static {
    	Configuration cfg = new AnnotationConfiguration();
		cfg.configure();
	    sfac = cfg.buildSessionFactory();
    }
	public static void main(String[] args) {
		
		FlightDaoImpl dao= new FlightDaoImpl();
		
		//List<FlightSchedule> lst = dao.getSchedule();
		//lst.forEach(System.out::println);
		List<FlightSchedule> lst = dao.getScheduleByInfo("Pune","Mumbai","2018-05-27");
		lst.forEach(System.out::println);
		
		
		
		
		/*for(FlightSchedule fli:lst) {
			System.out.println(fli.getSchId() + " " + fli.getSchDate() + " " + fli.getSeats()
			+ " " + fli.getFlight().getFlightName() + " " + fli.getFlight().getSrc() + " " + 
					fli.getFlight().getDest());
		}*/
		
}
}