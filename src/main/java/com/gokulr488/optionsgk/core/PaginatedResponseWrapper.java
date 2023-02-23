package com.gokulr488.optionsgk.core;

import java.util.ArrayList;
import java.util.List;

public class PaginatedResponseWrapper<T> {
	private int page;
	private int size;
	private Long totalElements;
	private int totalPages;
	private boolean last;
	private boolean first;
//	private Sort sort;
	private List<T> content = new ArrayList<>();

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public int getPage() {
		return page;
	}

//	public Sort getSort() {
//		return sort;
//	}
//
//	public void setSort(Sort sort) {
//		this.sort = sort;
//	}

	public void setPage(int page) {
		this.page = page;
	}

	public Long getTotalElements() {
		return totalElements;
	}

	public void setTotalElements(Long totalElements) {
		this.totalElements = totalElements;
	}

	public int getTotalPages() {
		return totalPages;
	}

	public void setTotalPages(int totalPages) {
		this.totalPages = totalPages;
	}

	public boolean isLast() {
		return last;
	}

	public void setLast(boolean last) {
		this.last = last;
	}

	public boolean isFirst() {
		return first;
	}

	public void setFirst(boolean first) {
		this.first = first;
	}

	public List<T> getContent() {
		return content;
	}

	public void setContent(List<T> content) {
		this.content = content;
	}
}
