package com.gokulr488.optionsgk.services.datacollector.ohlc.pojo;

import jakarta.validation.constraints.NotEmpty;

public class KiteAuthReq {

	@NotEmpty
	private String authorizationKey;
	@NotEmpty
	private String userId;

	public String getAuthorizationKey() {
		return authorizationKey;
	}

	public void setAuthorizationKey(String authorizationKey) {
		this.authorizationKey = authorizationKey;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
