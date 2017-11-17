package com.exception;

public class VehicleNotFoundException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public String getMessage() {
		System.out.println("Vehicle Is Not Present In Lane");
		return super.getMessage();
	}
	
}
