package ComparatorTest;

import java.util.*;
public class GenreSort implements Comparator{
	public int compare(MovieDVDInfo one, MovieDVDInfo two){
		return one.getGenre().compareTo(two.getGenre());
	}
	
	
}
