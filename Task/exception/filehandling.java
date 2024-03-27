package pattern;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
public class filehandling {

	public static void main(String[] args) throws IOException {
		File file = new File ("C:\\Users\\ELCOT\\Downloads\\Test\\info.txt");
		if(!file.exists())
		{                                                              // Creating a file
			file.createNewFile();
		}
		
		FileWriter writer = new FileWriter(file);
		writer.write("one1\n");
		writer.append("two2\n");
		writer.write("three3");
		
	double len = file.length() ;
		
		System.out.println("File-Size :" + len) ;                      // return a size of a file
		 
		long last = file.lastModified() ;
		
		System.out.println("Last-Modified :"  + last);    // return time-stamp of last modified
		 
		System.out.println("*************************");
		//System.err.println("Error") ;
		
		File directory = new File("C:\\Users\\ELCOT\\Downloads\\Test");
		File[] files = directory.listFiles();
		if (files != null) {
		    for (File file1 : files) {                                 // Get names from Folder
		        System.out.println(file1.getName());
		    }
		}
		writer.close();
		
		System.out.println("****************************") ;
		
		File readFile = new File("C:\\Users\\ELCOT\\Downloads\\Test\\demo.txt");
		if(!readFile.exists()) {
			readFile.createNewFile();
		}
//		FileReader reader = new FileReader(readFile);
//	    int x;
//	    String output = "";                                     // Read a file
//	    while ((x = reader.read())!= -1)
//	    {
//	    	output += (char) x;
//	    }
//	    reader.close() ;
//	    System.out.println(output);
		
		Scanner sc = new Scanner (readFile) ;
		
			try {
				while (sc.hasNext())
				{                                                         // Reading a file using Scanner
					System.out.println(sc.nextLine()) ;
				}
			} catch (Exception e) {
				
				e.printStackTrace();
			}
				}
	}


