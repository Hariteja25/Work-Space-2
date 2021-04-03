package file_operations;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class file2 {
	public static void main(String[] args) throws IOException {
	
		String p1="E:\\adv\\practice\\src\\file_operations\\input.txt";
		String p2="E:\\adv\\practice\\src\\file_operations\\output.txt";
		
		FileReader fr=new FileReader(p1);
		BufferedReader br=new BufferedReader(fr);
		
		FileWriter fw=new FileWriter(p2);
		BufferedWriter bw=new BufferedWriter(fw);
		
		try {
		String temp=null;
		while((temp=br.readLine())!=null) {
			bw.write(temp);
			
		}
		bw.flush();
		System.out.println("Transfer of data from input to output");
		}
		catch(Exception e) {
			e.printStackTrace();
			
		}
		
		
			fr.close();
			fw.close();
			br.close();
			bw.close();
		
	}

}
