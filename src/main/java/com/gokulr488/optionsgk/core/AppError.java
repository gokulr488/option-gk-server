package com.gokulr488.optionsgk.core;

public class AppError {
	private String errorMessage;
	private String errorDescription;

	public AppError(String errorMessage) {
		this.errorMessage = errorMessage;
	}

	public AppError(String errorMessage, String errorDescription) {
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
