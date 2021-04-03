package strings;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter any string");
		
		String name = sc.nextLine();
		
		
		//find length of string
		
		int size = name.length();
		System.out.println("size = "+size);
		
		//check str is starting with hi
		boolean c1 = name.startsWith("hi");
		System.out.println(" startswith hi is: "+c1);
		
		//check str is ending with bye
		boolean c2 = name.endsWith("bye");
		System.out.println("ends with : "+c2);
		
		//replace old word with new
		String changed = name.replaceAll(name,  "shyam");
		System.out.println("before replace ::"+name);
		System.out.println("after replace "+changed);
		
		//upper and lowr
		System.out.println(name.toUpperCase());
		System.out.println(name.toLowerCase());
		
		//substr: extracxt string from posi: 6 to posi: 10
		// satring position no starts from zero
		System.out.println(name.substring(6)); // prints from 7th till end
		System.out.println(name.substring(5, 9));
		
		//trim
		String data = "           hello kumar           ";
		System.out.println("before trim ::"+data);
		String trimmed = data.trim();
		System.out.println("after trim ::"+trimmed);
		
		// i/p: has multiple data in a string ; every data isseperated by #
		String inputdata = "kumar#23#1222424#6545777#nbjbubuuu";
		String[] splitdata = inputdata.split("#");
		System.out.println(splitdata[0]); // kumar
		System.out.println(splitdata[1]); // 23
		System.out.println(splitdata[2]); // 1222424
		System.out.println(splitdata[3]); // 6545777
		System.out.println(splitdata[4]);// nbjbubuuu







	}

}
