package com.persistent.errors;

import javax.xml.ws.WebFault;

@WebFault(name="Book_Exception")
public class CustomException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 2015769807378269580L;
	private ErrorBean errorBean;

	public CustomException(ErrorBean errorBean) {
		super();
		this.setErrorBean(errorBean);
		// TODO Auto-generated constructor stub
	}
	public CustomException(ErrorBean errorBean, String message)
	{
		super(message);
		this.setErrorBean(errorBean);
	}
	public ErrorBean getErrorBean() {
		return errorBean;
	}
	public void setErrorBean(ErrorBean errorBean) {
		this.errorBean = errorBean;
	}

}
