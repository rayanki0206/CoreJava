package fileOperations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileMethods {
	public static void main(String[] args) throws IOException {
		
	
	
	String file="/Users/vigneshchowdary/Documents/SampleInput1.docx";
	String file2="/Users/vigneshchowdary/Documents/SampleInputTest.docx";
	
	File file1=new File(file);
	File file3=new File(file2);
	
	System.out.println(file1.exists());
	System.out.println(file1.canWrite());
	System.out.println(file1.getAbsolutePath());
	System.out.println(file1.toString());
	System.out.println(file3.createNewFile());
	System.out.println(file1.canExecute());
	
	FileReader fr=new FileReader(file);
	BufferedReader br=new BufferedReader(fr);
	
	System.out.println(br.readLine());
	
	
	FileWriter fw=new FileWriter(file);
	BufferedWriter bw=new BufferedWriter(fw);
	
	bw.write("Vignesh hello world");
	bw.flush();
	
	}
}
