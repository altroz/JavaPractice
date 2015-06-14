package com.company.ArrayTest;

import java.util.ArrayList;

public class ArrayListTest {
	public static void main(String[]args){
		ArrayList test = new ArrayList();
		String s = "hi";
		test.add(s);
		test.add("string");
		test.add(s+s);
		System.out.println(test);
		System.out.println(test.size());
		System.out.println(test.contains(2));
		System.out.println(test.contains("hihi"));
		System.out.println(test.size());
	}
}
