package com.gokulr488.optionsgk.core;

import java.util.List;

public class SearchDetail {

	private List<SearchRecord> searchBy;
	
	private boolean globalSearch;

	public List<SearchRecord> getSearchBy() {
		return searchBy;
	}

	public void setSearchBy(List<SearchRecord> searchBy) {
		this.searchBy = searchBy;
	}

	public boolean isGlobalSearch() {
		return globalSearch;
	}

	public void setGlobalSearch(boolean globalSearch) {
		this.globalSearch = globalSearch;
	}
}
