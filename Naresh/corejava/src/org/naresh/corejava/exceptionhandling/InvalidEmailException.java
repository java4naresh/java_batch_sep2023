package org.naresh.corejava.exceptionhandling;

public class InvalidEmailException extends RuntimeException {
	
	public InvalidEmailException(String msg) {
		super(msg);
	}

}
