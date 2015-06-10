package com.company.FileNavigation;
import java.io.*;

public class TestFileWriter {
	public static void main(String[] args) {
		char[] in =  new char [50];
		int size = 0;
		
		try{
			File file = new File("MySecondFile.txt");
			FileWriter fw =  new FileWriter(file);
			fw.write("Hello fucking world !");
			fw.flush();
			fw.close();
			
			FileReader fr =  new FileReader(file);
			size =  fr.read(in);
			System.out.println(size + " ");
			for(char c: in){
				System.out.println(c);
				fr.close();
			}}
			
			catch(IOException e){
				System.out.println("Some Exceptions have occurred. ");}
	}
}
