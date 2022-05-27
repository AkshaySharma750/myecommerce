package com.myecommerceexception;

public class BusinessException extends Exception {

	private String errocode;
	private String errorMsg;
	
	public BusinessException() {
		
	}
	public BusinessException(String message) {
		super(message);
	}

	public String getErrocode() {
		return errocode;
	}

	public void setErrocode(String errocode) {
		this.errocode = errocode;
	}

	public String getErrorMsg() {
		return errorMsg;
	}

	public void setErrorMsg(String errorMsg) {
		this.errorMsg = errorMsg;
	}
}
