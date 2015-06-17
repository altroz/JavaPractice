package AnnonymousInnerClassTest;

public class Car {
	Ferrari p = new Ferrari(){
		public void brake(){System.out.println("Ferrari");}
		public void drive(){System.out.println("anonymous Ferari");}};
		
	public void popIt(){p.drive();;
						}
	
}
