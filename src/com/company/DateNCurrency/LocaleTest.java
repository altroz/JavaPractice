package com.company.DateNCurrency;

import java.util.*;
import java.text.*;

public class LocaleTest {
	public static void main(String[] args){
		Calendar c =  Calendar.getInstance();
		Date date = c.getTime();
		
		Locale locIT =  new Locale("it", "IT");
		
		DateFormat dfUS = DateFormat.getDateInstance(DateFormat.FULL);
		System.out.println("United States of America: " + dfUS.format(date));
		
		DateFormat dfIT = DateFormat.getDateInstance(DateFormat.FULL, locIT);
		System.out.println("Italy: "+ dfIT.format(date));
		
	}
}
