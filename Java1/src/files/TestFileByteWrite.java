package files;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

public class TestFileByteWrite {

	public static void main(String[] args) throws IOException {
		// specify file info
		File fileout = new File("C:\\test\\test2.txt");

		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(fileout);
			String read = "hi how are  you";
			fos.write(read.getBytes());
			fos.write("\n".getBytes());
			fos.write("welcome to java".getBytes());
		} catch (Exception ex) {
			System.out.println("fil3 write failed");
		} finally {
				fos.close();
		}
		System.out.println("file write success");
	}
}