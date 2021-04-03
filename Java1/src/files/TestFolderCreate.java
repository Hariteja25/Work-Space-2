package files;

//Create a folder "test" in C drive

import java.io.File;

public class TestFolderCreate {
	public static void main(String[] args) {
		//create a dir
		File file = new File("C:\\test");
		
		file.mkdir(); // this method will create the folder
		
	}
}

