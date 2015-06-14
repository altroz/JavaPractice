package com.company.StringTest;

public class StringTest1 {
	public static void main(String[]args){
		//String Method
		String a = "Rocky";
		System.out.println(a.charAt(2));
		
		String b = "ferrari";
		System.out.println(b.concat(" car"));
		
		String c = "Ferrari";
		System.out.println(c.equalsIgnoreCase("FERRARI"));
		System.out.println(c.length());
		System.out.println(c.replace("F", "A"));
		
		
	}
	
}
