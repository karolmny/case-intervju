/**
 * 
 */
package com.evry.interview;

public class SystemException extends Exception {

	private String context;

	public SystemException(String message) {
		super(message);
	}

	public SystemException(String message, String context) {
		super(message);
		this.context = context;
	}

	public String getContext() {
		return context;
	}

}

/*
 * This class inherrits from the class Exception
 * 
 * It has two constructors based on the number of output
 * Both methods takes the super(message) which invokes the parent class constructor
 * The secound sets the private variable to the input
 * 
 * It has a function that returns the privat variable
 *   
 *  -----
 * Should contex have a default value?
 */