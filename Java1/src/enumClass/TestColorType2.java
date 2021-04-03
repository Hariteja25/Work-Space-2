package enumClass;

/**
take color name as input .

if color is BLUE OR RED OR BLACK, OR GREEN, OR WHITE, OR 	BROWN => VALID COLOR
IF NOT print invalid color.



if application needs  2 more colors : YELLOW , MERUN
then we need to write two ENTRY inside the enum;
*/
import java.util.Scanner;

public class TestColorType2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter color");
		String input= sc.next();

		//get all objs
		boolean validColor = ColorType.isValidColor(input);
		if(validColor) {
			System.out.println("Valid color");
		}else {
			System.out.println("invalid color");
		}

	}
}


