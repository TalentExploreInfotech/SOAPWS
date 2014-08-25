package com.persistent.errors;

public class ErrorBean {
	private int code;
	private String message;
	public ErrorBean() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ErrorBean(int code, String message) {
		super();
		this.code = code;
		this.message = message;
	}
	public int getCode() {
		return code;
	}
	public void setCode(int code) {
		this.code = code;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	@Override
	public String toString() {
		return "ErrorBean [code=" + code + ", message=" + message + "]";
	}
}
