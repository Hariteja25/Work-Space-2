package file_operations;

import java.util.Scanner;

public class trywithResources {

	public static void main(String[] args) {
		try(Scanner scan =new Scanner(System.in)){
			System.out.println("Enter name");
			String s=scan.nextLine();
			System.out.println("its try with resources  "+s);
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}

	}

}
