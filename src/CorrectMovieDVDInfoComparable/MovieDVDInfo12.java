package CorrectMovieDVDInfoComparable;

public class MovieDVDInfo12 implements Comparable{
	String movieName;
	String movieType;
	String hero;
	
	MovieDVDInfo12(String t, String g, String a){
		movieName = t;
		movieType = g;
		hero = a;
	}
	
	public String toString(){
		return movieName+ " "+ movieType+ " "+ hero +  "\n";
	} 
	
	public int compareTo(MovieDVDInfo12 d){
		return movieName.compareTo(d.getTitle());
	
	}
	
	public String getTitle(){
		return movieName;
	}
	

}
