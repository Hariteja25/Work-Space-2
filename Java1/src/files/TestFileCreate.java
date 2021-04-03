package files;

import java.io.File;
import java.io.IOException;

/**
1.create file obj by specifying file path. [ make sure folder exists ]
2. call createNewFile(); method

 */
public class TestFileCreate {
	public static void main(String[] args) {
		//create a file
		File file = new File("C:\\test\\test12.txt");
		try {
			if(!file.exists())
				file.createNewFile();
		} catch (IOException e) {
			System.out.println("file creation failed");
		} 
	}
}

