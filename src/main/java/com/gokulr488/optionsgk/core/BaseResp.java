package com.gokulr488.optionsgk.core;

public class BaseResp {

	private int statusCode;
	private String message;
	private boolean success;

	public BaseResp(int statusCode, String message, boolean success) {
		super();
		this.statusCode = statusCode;
		this.message = message;
		this.success = success;
	}

	public int getStatusCode() {
		return statusCode;
	}

	public void setStatusCode(int statusCode) {
		this.statusCode = statusCode;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

}
