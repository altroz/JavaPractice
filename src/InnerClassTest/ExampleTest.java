package InnerClassTest;

public class ExampleTest {
	public static void main(String[] args){
		ExampleOuterClass oc = new ExampleOuterClass();
		ExampleOuterClass.ExampleInnerClass ic =  oc. new ExampleInnerClass();
		ic.accessOuter();
	}
}
