package propertyfiles;

import java.io.File;
/*
 steps:
------
1.create file obj for .properties file
2.create FileInputStream obj
3.create properties obj
4.read any property using properties obj
 */
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class GetProps {
	public static void main(String[] args) throws IOException {
		File f = new File("C:\\test\\config.properties");
		InputStream input= new FileInputStream(f);

		// load a properties file
		Properties prop = new Properties();
		prop.load(input);
		
		// get the property value and print it out
		
		String results = prop.getProperty("reultsperpage");
		System.out.println(prop.getProperty("name"));
		System.out.println(prop.getProperty("user"));
		System.out.println(prop.getProperty("pass"));
		System.out.println(prop.getProperty("IPADDRESS"));

		System.out.println(prop.getProperty("portNo"));

		System.out.println(prop.getProperty("dbName"));
		
		System.out.println(results);
 		input.close();
	}
}


