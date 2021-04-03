package util;


public class ServiceException extends RuntimeException {
	
	private static final long serialVersionUID = 5951090968873998002L;
	
	private String msg;
	private String code;
	
	
	
	public ServiceException(String msg, String code) {
		super();
		this.msg = msg;
		this.code = code;
	}
	
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	

}
