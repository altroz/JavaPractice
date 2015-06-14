package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("car([^,]*)");
		Matcher m = p.matcher("caresched.pdg,bke.txt,car,bus,car.java");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
