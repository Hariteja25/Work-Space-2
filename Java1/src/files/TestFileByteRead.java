package files;


import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class TestFileByteRead {

	public static void main(String[] args) throws IOException {
		//Create file obj
		File fileIn = new File("C:\\test\\test2.txt");

		//Create FileInputStream(fis) using file obj
		FileInputStream fis = new FileInputStream(fileIn);

		//create BufferedReader using fis
		BufferedReader br = new BufferedReader(new InputStreamReader(fis));

		try {
			String read;
			while ((read = br.readLine()) != null) { //use readLine() method
				System.out.println(read);
			}
		} catch (Exception ex) {
			System.out.println("file read failed");
		} finally {
			fis.close();
			br.close();
		}
	}
}



