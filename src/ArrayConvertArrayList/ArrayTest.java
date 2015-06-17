package ArrayConvertArrayList;
import java.util.*;

public class ArrayTest {
	

	String[] a sa = {"one","two","three","four"};
	List sList = Array.asList(sa);
	System.out.println("size:  "+ sList.size());
	System.out.println("idx2:  "+ sList.get(2));
	
	sList.set(3,"six");
	sa[1] = "five";
	
	for(String s: sa)
		System.out.println(s+ " ");
		System.out.println("\ns1[1]"+ sList.get(1));}
	
}
