package com.company.StringTest;

public class StringBuilder {

	public static void main(String[] args){
		StringBuffer sb = new StringBuffer("abc");
		sb.append("def");
		System.out.println("sb: "+ sb);
		sb.reverse().insert(3,"---");
		System.out.println(sb);
		
	}
}
