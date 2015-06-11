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
		c.roll(Calendar.MONTH, 11);
		Date d2 = c.getTime();
		System.out.println("New Time and Date is: "+ d2.toString());
	
		
	}
}