package GarbageCollectionTest;
import java.util.*;
public class TestGCBehavior {
	public static void main(String[]args){
		Runtime rt = Runtime.getRuntime();
		System.out.println("Total JVM Memory:  "+ rt.totalMemory());
		System.out.println("Before Memory:  "+ rt.freeMemory());
		
		Date d = null;
		for(int i = 0; i<100; i++){
			d = new Date();
			d = null;
		}
		System.out.println("After Memory =  "+ rt.freeMemory());
	
		System.gc();
		
		System.out.println("After GCMemory=  "+ rt.freeMemory());
		
	}
}
