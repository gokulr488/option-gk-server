package com.gokulr488.optionsgk.services.datacollector.ohlc.pojo;

public class OhlcCollectionReq {
	private String contractCode;
	private String candleType = "minute";
	private String userId;
	private String fromDate;
	private String toDate;
	private String cookie;

	public String getContractCode() {
		return contractCode;
	}

	public void setContractCode(String contractCode) {
		this.contractCode = contractCode;
	}

	public String getCandleType() {
		return candleType;
	}

	public void setCandleType(String candleType) {
		this.candleType = candleType;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getCookie() {
		return cookie;
	}

	public void setCookie(String cookie) {
		this.cookie = cookie;
	}

	public String getFromDate() {
		return fromDate;
	}

	public void setFromDate(String fromDate) {
		this.fromDate = fromDate;
	}

	public String getToDate() {
		return toDate;
	}

	public void setToDate(String toDate) {
		this.toDate = toDate;
	}

}
