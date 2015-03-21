package a1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFile {
  private String path;
  
  public ReadFile(String file_path){
	  path = file_path;
  }
  
 int readLines() throws IOException {
	 FileReader file_to_read = new FileReader(path);
	 BufferedReader bf =  new BufferedReader( file_to_read);
	 String  aLine;
	 int numberOfLines = 0;
	 while((aLine = bf.readLine()) != null){
		 numberOfLines++;
	 }
	 bf.close();
	 return numberOfLines;
 }
  
  public String[] OpenFile() throws IOException{
	  FileReader fr = new FileReader(path);
	  BufferedReader textReader = new BufferedReader(fr);
	  int numberOfLines =  readLines();
	  
	  String[] textData = new String[numberOfLines];
	  
	  for(int i =0; i<textData.length; i++){
		  textData[i] = textReader.readLine();
	  }
		  
	 textReader.close();
	 return textData;
  }
}
