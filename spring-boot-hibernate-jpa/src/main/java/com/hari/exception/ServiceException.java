package com.hari.exception;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ServiceException extends RuntimeException {
	
	private static final long serialVersionUID = -6052698741810862437L;


	private static final Logger logger = LoggerFactory.getLogger(ServiceException.class);

	
	private String msg;
	private String code;

	public ServiceException(String msg,String code) {
		super();
		this.code = code;
		this.msg = msg;
	}

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}
	
}



