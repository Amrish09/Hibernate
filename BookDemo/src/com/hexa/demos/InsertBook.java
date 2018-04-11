package com.hexa.demos;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.hexa.dao.BookImpl;
import com.hexa.dao.IDao;
import com.hexa.entity.Book;


public class InsertBook {
		private static IDao dao = new BookImpl();
		public static void main(String[] args) {
	
			Book b=new Book();
			b.setBookId(1515);
			b.setBookName("The Monk who sold his Ferrari ");
			b.setBookPrice(4000);
			b.setCategory("Robin Sharma");
			int res = dao.addBook(b);
			System.out.println("inserted :" + res + " rows");

		}

	}


