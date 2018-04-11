package com.hexa.dao;

import java.util.Date;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

import com.hexa.entity.BookingDetails;
import com.hexa.entity.FlightSchedule;


public class FlightDaoImpl implements FlightDao{

	private static SessionFactory sfac;
	static {
		Configuration cfg=new AnnotationConfiguration().configure();
		sfac = cfg.buildSessionFactory();
	}
	@Override
	public int addBookingDetails(BookingDetails bdet) {
			Session sess= null;
			Transaction tx= null;
		try {
			sess= sfac.openSession();
			tx = sess.beginTransaction();
			sess.save(bdet);
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
	@Override
	public List<FlightSchedule> getSchedule() {
		Session sess = sfac.openSession();
		String hql = "from FlightSchedule f inner join fetch f.flight";
		Query qry = sess.createQuery(hql);
		List<FlightSchedule> lst=qry.list();
		return lst;
	}
	@Override
	public BookingDetails getDetails(int pnrno) {
		Session sess = sfac.openSession();
		String hql ="from BookingDetails b where pnrId=?";
		Query qry = sess.createQuery(hql);
		qry.setInteger(0, pnrno);
		BookingDetails b = (BookingDetails)qry.uniqueResult();
		
		return b;
	}
	@Override
	public int updateSeats(FlightSchedule fsch, int seat) {
		Session sess =sfac.openSession();
		FlightSchedule fs =(FlightSchedule)sess.get(FlightSchedule.class,fsch.getSeats());
		Transaction tx = sess.beginTransaction();
	    fs.setSeats(seat);
		tx.commit();
		sess.close();
		return 1;
		
	}
	@Override
	public List<FlightSchedule> getScheduleByInfo(String src, String dest,String date) {
		Session sess = sfac.openSession();
		String hql = "from FlightSchedule fs inner join fetch fs.flight f where f.src=? and f.dest=? and fs.schDate=?";
		Query qry = sess.createQuery(hql);
		qry.setString(0,src);
		qry.setString(1,dest);
		qry.setString(2, date);
		List<FlightSchedule> lst=qry.list();
		return lst;
	}
	}


