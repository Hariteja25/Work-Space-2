package files;
import java.io.File;
import java.io.FileReader;

public class TestFileReader {  
    public static void main(String args[])throws Exception{
    	  File file = new File("C:\\test\\test12.txt");	
          FileReader fr=new FileReader(file);    
          int i;    
          while((i=fr.read())!=-1)    
          System.out.print((char)i);    
          fr.close();    
    }
}

