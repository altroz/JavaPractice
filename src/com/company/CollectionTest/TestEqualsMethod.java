package com.company.CollectionTest;

public class TestEqualsMethod {
	public static void main(String[] args){
		TestClass one = new TestClass(8);
		TestClass two = new TestClass(8);
		
		if(one.equals(two)){
			System.out.println("one and two are equal");
		}
	}
}
