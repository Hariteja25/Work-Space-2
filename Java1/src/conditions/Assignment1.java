package conditions;

import java.util.Scanner;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);// sc is point of contact for console

		System.out.println("enter bankname ");
		String bankname = sc.next();
		if(bankname.equals("sbi"))
		{
			System.out.println("ROI=10%");
		}
		else if(bankname.equals("icici"))
		{
			System.out.println("ROI=11%");
		}
		else if(bankname.equals("hdfc"))
		{
			System.out.println("ROI=12%");
		}
		else if(bankname.equals("citi"))
		{
			System.out.println("ROI=13%");
		}
		else
		{
		System.out.println("invalid bank");	


	}

}
}
