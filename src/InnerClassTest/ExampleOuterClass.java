package InnerClassTest;

public class ExampleOuterClass {
	private int x = 7;
	class ExampleInnerClass{
		public void accessOut(){
			System.out.println("Outer x is "+ x);
		}
	}
}
