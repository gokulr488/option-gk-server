package com.gokulr488.optionsgk.core;

public class MisError {
	private String errorMessage;
	private String errorDescription;

	public MisError(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public MisError(String errorMessage, String errorDescription) {
		this.errorMessage = errorMessage;
		this.errorDescription = errorDescription;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}
}
