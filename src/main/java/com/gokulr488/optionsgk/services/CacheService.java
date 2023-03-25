package com.gokulr488.optionsgk.services;

import org.springframework.stereotype.Service;

@Service
public class CacheService {
	
	private String kiteAuthToken;
	private String userId;

	public String getKiteAuthToken() {
		return kiteAuthToken;
	}

	public void setKiteAuthToken(String kiteAuthToken) {
		this.kiteAuthToken = kiteAuthToken;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

}
