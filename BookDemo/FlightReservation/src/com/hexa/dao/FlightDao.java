package com.hexa.dao;

import java.util.Date;
import java.util.List;

import com.hexa.entity.BookingDetails;
import com.hexa.entity.FlightSchedule;


public interface FlightDao {
 public int addBookingDetails(BookingDetails bdet);
 public List<FlightSchedule> getSchedule();
 public BookingDetails getDetails(int pnrno);
 public int updateSeats(FlightSchedule fsch, int seat);
 public List<FlightSchedule> getScheduleByInfo(String src, String dest, String date);
}
