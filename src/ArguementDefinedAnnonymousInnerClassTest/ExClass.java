package ArguementDefinedAnnonymousInnerClassTest;

public class ExClass {
	void doSomething(){
		Class1 b = new Class1();
		b.doSomethingElse(new Interface1(){
			public void doSomethingElse(){
				System.out.println("HEY!");
			}
		});
	}
}
