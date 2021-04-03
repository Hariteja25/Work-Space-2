package practice;

import java.io.File;
import java.io.IOException;

public class file {

	public static void main(String[] args) {
	   
	   try {
		   File f=new File("E:\\teja\\hk.txt");
	             boolean fvar = f.createNewFile();
		     if (fvar){
		          System.out.println("File has been created successfully");
		     }
		     else{
		          System.out.println("File already present at the specified location");
		     }
	    	} catch (IOException e) {
	    		System.out.println("Exception Occurred:");
		        e.printStackTrace();
		  }

	}

}
