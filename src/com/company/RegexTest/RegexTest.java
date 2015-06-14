package com.company.RegexTest;

import java.util.regex.*;

public class RegexTest {
	public static void main(String[]args){
		Pattern p = Pattern.compile("[abc]");
		Matcher m = p.matcher("a12c3e456f");
		
		while(m.find()){
			System.out.print(m.start()+" ");}
	}
}
