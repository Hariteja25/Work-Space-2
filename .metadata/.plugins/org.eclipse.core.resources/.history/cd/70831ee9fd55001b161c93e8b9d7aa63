package practice;

import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	public static void main(String[] args) throws IOException{
	   
	   try {
		 //  File f=new File("E:\\teja\\java.txt");
		   //f.createNewFile();
		   
		   
		   /*FileWriter fw= new FileWriter(f);
		   fw.write("Hi This is No_One");
		   fw.close();*/
	         
		   
		   FileOutputStream fos=new FileOutputStream("E:\\teja\\java.txt");
		   String data="Hi Iam Damon";
		   byte[] b=data.getBytes();
		   fos.write(b);
		   fos.close();
		   System.out.println("Completed writng a File");
		   
		   
	    	} catch (Exception e) {
	    		e.printStackTrace();
	    		
		  }

	}

}
