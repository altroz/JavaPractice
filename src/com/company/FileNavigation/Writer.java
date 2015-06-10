package com.company.FileNavigation;
import java.io.*;

public class Writer {
	public static void main(String[] args) {
		try{
			boolean newFile =  false;
			File file = new File ("myFirstTextFile.txt");
			System.out.println(file.exists());
			newFile =  file.createNewFile();
			System.out.println(newFile);
			System.out.println(file.exists());
			}
		
		catch(IOException e) {
			System.out.println("There is an Error");
		}
	}
}
