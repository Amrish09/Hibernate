package com.hexa.demos;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import com.hexa.dao.FlightDao;
import com.hexa.dao.FlightDaoImpl;
import com.hexa.entity.BookingDetails;
import com.hexa.entity.CustomerDetails;
import com.hexa.entity.FlightSchedule;

public class InsertBookingDetails {
	private static FlightDao dao = new FlightDaoImpl();
	public static void main(String[] args) {
		BookingDetails bdet= new BookingDetails();
		CustomerDetails cust = new CustomerDetails();
		cust.setCustId(1003);
		FlightSchedule fd = new FlightSchedule();
		fd.setSchId(3003);
	
        bdet.setPassengers(2);
        Random rand = new Random();
        int pno=rand.nextInt(1000);
        bdet.setPnrId(pno);
      
       bdet.setSchedule(fd);
      bdet.setCustomer(cust);
     
        int res=dao.addBookingDetails(bdet);
        System.out.println("row inserted");
	}

}
