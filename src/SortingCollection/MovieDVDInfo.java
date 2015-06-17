package SortingCollection;

import java.util.*;

public class MovieDVDInfo {
	String movieName;
	String movieType;
	String Hero;
	
	MovieDVDInfo(String name, String type, String hero){
		movieName = name;
		movieType = type;
		Hero = hero;
	}
	
	public String toString(){
		return movieName+ " "+ movieType+ " "+Hero+ "\n";
	}
	
	ArrayList dvdList = new ArrayList();
	System.out.println(dvdList);
	Collections.sort(dvdList);
}
