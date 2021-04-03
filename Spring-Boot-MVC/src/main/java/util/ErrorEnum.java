package util;

public enum ErrorEnum {

	ERRO1("ERRO1", "Invalid  Id"), 
	ERRO2("ERRO2", "Invalid Title"), 
	ERRO3("ERRO3", " Invalid Category"),
	ERRO4("ERRO4", "Product Title already exists...");
	

	private String errorCode;
	private String msg;

	private ErrorEnum(String errorCode, String msg) {
		this.errorCode = errorCode;
		this.msg = msg;
	}

	public String getErrorCode() {
		return errorCode;
	}

	public String getMsg() {
		return msg;
	}

}
