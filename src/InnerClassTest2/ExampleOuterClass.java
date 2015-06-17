package InnerClassTest2;

public class ExampleOuterClass {
	private int x = 7;
	public  void instantiateInnerClass(){
		ExampleInnerClass in = new ExampleInnerClass();
		in.accessOuter();
	}
	class ExampleInnerClass{
		public void accessOuter(){
			System.out.println("Outer x is "+ x);
			System.out.println("Inner ref is "+ this);
			System.out.println("Outer ref is "+ ExampleOuterClass.this);
		}
	}
}
