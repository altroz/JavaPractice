package SortingCollection;

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
}
