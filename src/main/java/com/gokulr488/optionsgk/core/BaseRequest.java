package com.gokulr488.optionsgk.core;

public class BaseRequest {
	private SearchDetail searchDetail;
	private PagenationDetail paginationDetail;
	private String createdBy;
	private String updatedBy;


	public SearchDetail getSearchDetail() {
		return searchDetail;
	}

	public void setSearchDetail(SearchDetail searchDetail) {
		this.searchDetail = searchDetail;
	}

	public PagenationDetail getPaginationDetail() {
		return paginationDetail;
	}

	public void setPaginationDetail(PagenationDetail paginationDetail) {
		this.paginationDetail = paginationDetail;
	}

	public String getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public String getUpdatedBy() {
		return updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

}
