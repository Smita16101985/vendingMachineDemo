package com.smita.Exception;

public class InSufficientBalance extends RuntimeException{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String messsage;

	public InSufficientBalance(String messsage) {
		super();
		this.messsage = messsage;
	}

	public String getMesssage() {
		return messsage;
	}

}
