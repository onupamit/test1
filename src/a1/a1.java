package a1;

import java.io.IOException;
import java.io.PrintWriter;

public class a1 {
	
	public static void main(String args[]){
	//	String file_name = "c:/test.txt";
		String file_name="/Users/shamimchy/Desktop/Filetxt.txt";
		
	
		try {
		ReadFile file =  new ReadFile(file_name);
		String[] aryLines = file.OpenFile();
		
		for(int j= 0; j< aryLines.length; j++){
			System.out.println(aryLines[j]);
		}
	}
	catch (IOException e){
		System.out.println("Sorry, Dude- no can do!");
	}
	
	try{	
	
	WriteFile data = new WriteFile(file_name, true);
	data.WriteToFile("This is another Line of Test");
	}
	catch (IOException e){
		System.out.println(e.getMessage());
	}
	 }
	 
	
	
	}


