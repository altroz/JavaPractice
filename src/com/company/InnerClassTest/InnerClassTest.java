package com.company.InnerClassTest;

public class InnerClassTest {
	public static void main(String[]args){
		ExampleOuterClass.ExampleInnerClass inner = new ExampleOuterClass().ExampleInnerClass();
		inner.accessOuter();
		
	}
}
