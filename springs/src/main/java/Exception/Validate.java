package Exception;
public class Validate {
	private Save sv;

	
	
	
	
	public static void validate(int age,int id) throws BusinessException {
		System.out.println("inside validate - enter");
		
		
		
		if ((age < 18)&&(id <= 0)) {
			throw new BusinessException("Age is Invalid And Id is Invalid ");
		}


		if (age < 18) {
			throw new BusinessException("Age is invalid");
		}
		if (id <= 0) {
			throw new BusinessException("Id is invalid");
		}
		
		
		Save.save(age,id);
		System.out.println("inside validate - exit");
	}

	public Save getSv() {
		return sv;
	}

	public void setSv(Save sv) {
		this.sv = sv;
	}


}
