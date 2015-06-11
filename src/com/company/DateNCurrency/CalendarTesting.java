package com.company.DateNCurrency;

import java.util.*;
// java.util.Calendar: class that provides with many methods
// to convert and manipulate dates and times. 

public class CalendarTesting {
	public static void main(String[]args){
		Date d1 = new Date();
		System.out.println("The Time and Date is: "+ d1.toString());
		
		Calendar c = Calendar.getInstance();
		c.setTime(d1);
		
		Date d2 = c.getTime();
		d2.setTime(d1.getTime()+3600000);
		System.out.println("new time: "+ d2.toString());
		
	}
}