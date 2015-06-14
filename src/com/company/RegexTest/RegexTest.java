package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("[a-cA-C]");
		Matcher m = p.matcher("cafeBABE");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
