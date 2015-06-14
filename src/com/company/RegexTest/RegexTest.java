package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("xy");
		Matcher m = p.matcher("xyxxxyx");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
