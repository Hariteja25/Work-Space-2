package exceptions;

public class BusinessException extends Exception {

	private final String errCode;

	public BusinessException(String errCode) {
		this.errCode = errCode;
	}
	
	public BusinessException(String errCode,String msg) {
		super(msg);
		this.errCode = errCode;
	}

	public String getErrCode() {
		return errCode;
	}

}
