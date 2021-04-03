package Exception;

import java.util.Scanner;

public class Input  {
	
	
	private process pro;
	
	
	public static void input() throws BusinessException {
		System.out.println("Entering into Input  ");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=sc.nextInt();
		
		
		System.out.println("Enter the id");
		int id=sc.nextInt();
		
		process.process(age,id);
		
		System.out.println("Ending from Input  ");

		
	}
	
	
	public process getPro() {
		return pro;
	}

	public void setPro(process pro) {
		this.pro = pro;
	}



}
