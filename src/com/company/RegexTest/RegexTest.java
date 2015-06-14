package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("0[Xx][0-9a-fA-F]");
		Matcher m = p.matcher("12 0x 0x12 0Xf 0xg");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
