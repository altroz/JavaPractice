package com.company.StringTest;

public class StringTest {
	public static void main(String[]args){
	//1
		String a = new String();
			   a="abc";
		
	//2
		String b = new String("AA213_AOGT");
	//3
		String c = "a_ew34Sbc";

	a=a.concat("Efg");
	System.out.println(a);
	a=a.toLowerCase();
	System.out.println(a);
	a=a.toUpperCase();
	System.out.println(a);
	
	b=b.toString();
	c=c.trim();
	System.out.println(b);
	System.out.println(c);
	
	
	}
}
