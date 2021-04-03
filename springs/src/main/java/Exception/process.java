package Exception;
public class process {
	private Validate val;
	

	

	public Validate getVal() {
		return val;
	}

	public void setVal(Validate val) {
		this.val = val;
	}


	public static void process(int age, int id) throws BusinessException {
		System.out.println("inside process - enter");
		 Validate.validate(age,id);
		
		System.out.println("inside process - exit");
	}
	}


