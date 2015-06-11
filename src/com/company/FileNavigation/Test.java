package com.company.FileNavigation;
import java.io.*;
public class Test {
	public static void main(String [] args){
		char []in = new char [50];
		int size = 0;
		
		try{
			File ADirectory = new File("ADirectory");
			ADirectory.mkdir();
			
			File ADirectoryTestText = new File(ADirectory,"ADirectoryTestText.txt");
			
			FileWriter fw = new FileWriter(ADirectoryTestText);
			fw.write("This is for testing purposes");
			fw.flush();
			fw.close();
			
			FileReader fr = new FileReader(ADirectoryTestText);
			size = fr.read(in);
			System.out.println(size);
			
			for(char c: in){
				System.out.print(c);
			}
			fr.close();
		}
		catch(IOException e){
			e.printStackTrace();
		}
	}
}
