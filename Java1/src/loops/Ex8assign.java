package loops;
/*
 * #Find the rank for given studnet Name , sub1 , sub2 , sub3
 

I/P:
no of students : 3

# user1 70 80 90
# user2 100 90 100
# user3 100 80 70

o/p:
user2 got 1st rank
*/

import java.util.Scanner;

public class Ex8assign {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter size");
		int size= sc.nextInt();
		for(int i=1;i<=size;i++)
		{
			System.out.println("Enter the student name=");
			String useri=sc.next();
			System.out.println("Enter sub1 marks");
			int sub1=sc.nextInt();
			System.out.println("Enter sub2 marks");
			int sub2=sc.nextInt();
			System.out.println("Enter sub3 marks");
			int sub3=sc.nextInt();
			int totali= sub1+sub2+sub3;
			
				
			
		}
		
			
		}

	}


