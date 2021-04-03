package enumClass;

import java.util.Scanner;

/**
take color name as input .

if color is BLUE OR RED OR BLACK, OR GREEN, OR WHITE, OR 	BROWN => VALID COLOR
IF NOT print invalid color.

if application needs  2 more colors : YELLOW , MERUN
then we needto write two more conditions.

*/
public class TestColorType1 {  //Without enum
	public static void main(String[] args) {
		//take color name
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color");
		String input= sc.next();

		if( input.equals("BLUE") || input.equals("RED") ||input.equals("BLACK")
				||input.equals("GREEN") ||input.equals("WHITE") ||input.equals("BROWN") ) {
			System.out.println("VALID COLOR");
		}else {
			System.out.println("invalid color");
		}

	}
}

