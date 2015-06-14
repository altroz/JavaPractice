package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("\\d+");
		Matcher m = p.matcher("1 a44 555b");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
