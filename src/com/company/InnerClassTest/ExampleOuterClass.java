package com.company.InnerClassTest;

public class ExampleOuterClass {
	private int x = 7;
	public void instantiateInnerClass(){
		ExampleInnerClass in =new ExampleInnerClass();
		in.accessOuter();
	}
	
	class ExampleInnerClass{
		public void accessOuter(){
			System.out.println("Outer x is: "+ x);
		}
	}
}
