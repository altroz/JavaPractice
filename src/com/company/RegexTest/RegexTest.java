package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("\\d\\d\\d([-\\s])?\\d\\d\\d\\d");
		Matcher m = p.matcher("9876543,987 6543,987-6543");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
