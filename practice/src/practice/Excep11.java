package practice;

public class Excep11 {
	
public static void main(String[] args) throws BusinessException {
	
	Excp22 e=new Excp22();
	try {
    int r=e.process(12,12);
    if(r==0) {
    	
    	throw new BusinessException("401","Dont pass the same values");
    }

	}
	finally {
		System.out.println("exception handled");
	}
}
}
