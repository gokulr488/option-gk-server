package com.gokulr488.optionsgk.core;

public class PagenationDetail {
	private boolean isPageable;
	private int size;
	private int page;
	private String order;
	private String sort;
	

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public String getOrder() {
		return order;
	}

	public void setOrder(String order) {
		this.order = order;
	}

	public String getSort() {
		return sort;
	}

	public void setSort(String sort) {
		this.sort = sort;
	}

	public boolean isPageable() {
		return isPageable;
	}

	public void setPageable(boolean isPageable) {
		this.isPageable = isPageable;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	
}
