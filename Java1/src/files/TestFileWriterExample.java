package files;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class TestFileWriterExample {
	public static void main(String args[]) throws IOException {
 				 File file = new File("C:\\test\\test12.txt");
         FileWriter fw = null;
         
  				try {
			 				fw = new FileWriter(file);
              fw.write("Hi\n   ");
							fw.write("Hello");
					} catch (Exception e) {
								System.out.println(e);
					} finally {
			 				fw.close();
					}
  			System.out.println("file write Success...");
  }
  
  }
