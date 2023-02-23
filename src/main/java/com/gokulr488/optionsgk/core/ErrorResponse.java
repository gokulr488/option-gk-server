package com.gokulr488.optionsgk.core;

public class ErrorResponse {
	private int statusCode;
	private boolean status;
	private String errorMessage;
	private String errorDescription;

	public String getErrorDescription() {
		return errorDescription;
	}

	public void setErrorDescription(String errorDescription) {
		this.errorDescription = errorDescription;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public int getStatsCode() {
		return statusCode;
	}

	public void setStatusCode(int statsCode) {
		this.statusCode = statsCode;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public String getErrorMessage() {
		return errorMessage;
	}

	public void setErrorMessage(String errorMessage) {
		this.errorMessage = errorMessage;
	}

}
