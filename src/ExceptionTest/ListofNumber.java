package ExceptionTest;

import java.io.*;
import java.util.*;

public class ListofNumber {
		private List<Integer> list;
		private static final int SIZE = 10;
	
	public ListofNumber(){
		list=new ArrayList<Integer>(SIZE);
		for(int i = 0; i<SIZE; i++){list.add(new Integer(i));}
	
	}
	
	public void writeList(){
		PrintWriter out;
		try {
			out = new PrintWriter(new FileWriter("OutFile.txt"));
			for(int i = 0; i<SIZE; i++){
				out.println("Value at : "+i+ "=" + list.get(i));

			}
			out.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}

