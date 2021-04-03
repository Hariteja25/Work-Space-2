package Exception;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		

		try {
			Input.input( );
		}
		catch(BusinessException ex) {
			System.out.println(ex.getErrCode());
		}
		
		

	}

}
