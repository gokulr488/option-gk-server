package com.gokulr488.optionsgk.services;

import org.springframework.stereotype.Service;

import com.gokulr488.optionsgk.core.Config;

@Service
public class CacheService {
	private Config config = new Config();

	public String getConfig(String key) {
		return config.getConfig(key);
	}
	
	public void setConfig(String key,String value) {
		config.setConfig(key, value);
	}

}
