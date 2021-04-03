package files;
/*
-> How to determina if the file obj represents a file or folder??
boolean isFile = file.isFile();
boolean isDir = file.isDirectory();


Read all files/folders names in the given folder
use listFiles() method to read all the files/Folder ; this retuns the array of files obj.
*/

import java.io.File;

public class ReadAllFiles {
	public static void main(String[] args) {

		File f1 = new File("C://test");
		File[] listFiles = f1.listFiles();
		for (File f : listFiles) {
			boolean isFile = f.isFile();
			boolean isDir = f.isDirectory();
			
			System.out.println(( isFile ?"File name = " :"folder name =  " ) + f.getName());
		}
	}
}


