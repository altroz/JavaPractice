package InnerClassTest2;

public class TestExample {
	public static void main(String[] args){
		ExampleOuterClass oc = new ExampleOuterClass();
		ExampleOuterClass.ExampleInnerClass inner = oc.new ExampleInnerClass();
		inner.accessOuter();
	}
}
