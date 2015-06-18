package SetsTesting;
import java.util.*;
public class MyFirstSetExample {
	
	
	public static void main(String []args){
		boolean [] ba = new boolean[5];
		Set s = new HashSet();
		
		ba[0]=  s.add(new Integer(42));
		ba[1]=  s.add("b");
		ba[2]=  s.add("a");
		ba[3]=  s.add(new Object());
		ba[4]=  s.add("a");
		
		for(int x = 0; x<ba.length;x++){
			System.out.print(ba[x]+ " ");
			System.out.print("\n");
		}
		
		for(Object o: s){
			System.out.println(o + " ");
		}
	}

}
