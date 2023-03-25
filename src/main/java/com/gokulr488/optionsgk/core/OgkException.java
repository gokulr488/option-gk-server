package com.gokulr488.optionsgk.core;

public class OgkException extends Exception {
	private AppError error;

	private static final long serialVersionUID = 1L;

	public OgkException(String message) {
		super(new Exception(message));
		error=new AppError(message);
		
	}

	public AppError getError() {
		return error;
	}

	public void setError(AppError error) {
		this.error = error;
	}
}
