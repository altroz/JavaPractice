package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("x.z");
		Matcher m = p.matcher("xy xyz x z");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
