package com.gokulr488.optionsgk.core;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.gokulr488.optionsgk.core.utils.FileUtils;

public class Config {
	public Config() {
		loadConfigs();
	}

	private final Logger log = LoggerFactory.getLogger(Config.class);

	public static final String KITE_AUTH_TOKEN = "KITE_AUTH_TOKEN";
	public static final String KITE_USER_ID = "KITE_USER_ID";

	private Map<String, String> configsMap = new HashMap<>();

	public void setConfig(String key, String value) {
		configsMap.put(key, value);
		persistConfigs();
	}

	public String getConfig(String key) {
		return configsMap.get(key);
	}

	private void persistConfigs() {
		List<String> props = new ArrayList<>();
		for (Entry<String, String> config : configsMap.entrySet()) {
			props.add(config.getKey() + ":" + config.getValue());
		}
		try {
			FileUtils.write(props, Constants.CONFIG_FILE);
		} catch (OgkException e) {
			log.error("Failed to write configs to file", e);
		}
	}

	private void loadConfigs() {
		try {
			List<String> props = FileUtils.readFile(Constants.CONFIG_FILE);
			for (String line : props) {
				String[] parts = line.split(":");
				if (parts.length == 2)
					configsMap.put(parts[0], parts[1]);
			}
			log.info("{} properties loaded from {} file", props.size(), Constants.CONFIG_FILE);
		} catch (OgkException e) {
			log.error("Failed to read configs from file", e);
		}
	}

}
