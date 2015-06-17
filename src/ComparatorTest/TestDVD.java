package ComparatorTest;

import java.util.*;
import java.io.*;

public class TestDVD {
	ArrayList dvdList = new ArrayList();
	public static void main(String[]args){
		new TestDVD().go();
	}
	
	public void go(){
		populateList();
		System.out.println(dvdList);
		Collections.sort(dvdList);
		System.out.println(dvdList);
		
		GenreSort gs = new GenreSort();
		Collections.sort(dvdList, gs);
		System.out.println(dvdList);
	}
	
	public void populateList(){
		
		//Read the File, Create MovieDVDInfo instances. 
	}
}
