package exam;

import java.util.Scanner;

/*
3. Write a program to check if the given array is unique or not? Unique-no repeated elements.

 */
public class Ex3 {
public static void main(String[] args) {
	int[] array=new int[5];
	 array[0]=1;
	 array[1]=2;
	 array[2]=3;
	 array[3]=4;
	 array[4]=5;
	 Scanner sc= new Scanner(System.in);
	 System.out.println("enter the input");
	 int input=sc.nextInt();
	 String input2=String.valueOf(input);
	 
	 if(input2.equals(array))
	 {
		 System.out.println("array is not unique");
	 }
	 else {
		 System.out.println("array is unique");
	 }
}
}
