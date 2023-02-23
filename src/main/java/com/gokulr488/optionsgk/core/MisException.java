package com.gokulr488.optionsgk.core;

public class MisException extends Exception {
	private MisError error;

	private static final long serialVersionUID = 1L;

	public MisException(String message) {
		super(new Exception(message));
		error=new MisError(message);
		
	}

	public MisError getError() {
		return error;
	}

	public void setError(MisError error) {
		this.error = error;
	}
}
