package com.book.mytime.exception;

public class RecordNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 1L;

	public RecordNotFoundException(String exception)
	{
		super(exception);
	}
}
