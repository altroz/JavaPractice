package StaticInnerClass;

public class Test {
	static class B2{void goB2(){
		System.out.println("Hi2");
	}}
	
	public static void main(String[]args){
		MyExOuter oc = new MyExOuter();
		MyExOuter.MyStaticInner inner = oc.new MyStaticInner();
		
		inner.doSomething();
		B2 b2 = new B2();
		B2.goB2();
	}
}
