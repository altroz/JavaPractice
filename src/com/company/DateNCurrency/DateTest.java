package com.company.DateNCurrency;
import java.util.*;

public class DateTest {
	public static void main(String [] args){
			Date date = new Date();
			System.out.println("Time right now:  "  + date.toString());
			date.setTime(date.getTime() + 3600000);
			System.out.println("Time in 1 hour:  " + date);
	}
}
