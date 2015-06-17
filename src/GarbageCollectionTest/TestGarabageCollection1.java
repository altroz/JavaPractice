package GarbageCollectionTest;

public class TestGarabageCollection1 {
	public static void main(String[]args){
		StringBuffer s1 = new StringBuffer("Hello");
		StringBuffer s2 = new StringBuffer("GoodBye");
		
		System.out.println(s1 + " "+ s2);
		s1=s2;
	}
}
