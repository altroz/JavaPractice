package SortingCollection;

import java.util.*;


public class MovieDVDInfo implements Comparable {
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
	
	public int compareTo(MovieDVDInfo d){
		return movieName.compareTo(d.getTitle());
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		MoiveDVDInfo d = (MoiveDVDInfo)o;
		return movieName.compareTo(d.getTitle());
	}
}
