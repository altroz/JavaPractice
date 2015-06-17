package MethodLocalInnerClass;

public class ExOuterClass {
	private String x  = "Outer";
	
	void doSomething(){
		
		class ExInnerClass{
			public void accessOuter(){System.out.println("Outer x is "+ x);}
		}
		
	ExInnerClass inner = new ExInnerClass();
	inner.accessOuter();
	}
	

}
