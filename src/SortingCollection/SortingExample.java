package SortingCollection;


import java.util.*;
public class SortingExample {
	public static void main(String[] args){
		ArrayList<String> stuff = new ArrayList<String>();
		
		stuff.add("Ferrari");
		stuff.add("BWM");
		stuff.add("Porsche");
		stuff.add("Aston Martin");
		stuff.add("Lamborghini");
		
		System.out.println("unsorted:  "+ stuff);
		Collections.sort(stuff);
		System.out.println("sort:  "+ stuff);
		
	}
}
