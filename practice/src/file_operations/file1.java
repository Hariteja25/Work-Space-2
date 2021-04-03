package file_operations;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class file1 {
	public static void main(String[] args) throws IOException {
		
		String p1="input.txt";
		String p2="output.txt";
		
		FileInputStream fis=new FileInputStream(p1);
		FileOutputStream fos=new FileOutputStream(p2);
		
		int temp;
		while((temp=fis.read())!=-1) {
			fos.write(temp);
			
		}
		System.out.println("Transfer of data from input to output");
	}

}
