package com.smita.Exception;

public class SoldOutException extends RuntimeException{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String message;

	public SoldOutException(String message) {
		super();
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

}
