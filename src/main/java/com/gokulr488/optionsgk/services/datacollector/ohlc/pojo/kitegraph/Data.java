package com.gokulr488.optionsgk.services.datacollector.ohlc.pojo.kitegraph;

import java.util.List;

public class Data {
	private List<List<String>> candles;

	public List<List<String>> getCandles() {
		return candles;
	}

	public void setCandles(List<List<String>> value) {
		this.candles = value;
	}
}