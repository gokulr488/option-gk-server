package com.gokulr488.optionsgk.core;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

public class BaseProcessor {

//	public PageRequest getPageable(PagenationDetail detail) {
//		PageRequest pageable = null;
//		if (detail.getOrder() != null && detail.getSort() != null) {
//			pageable = setPaginationMetaData(detail.getPage(), detail.getSize(),
//					Sort.by(Direction.fromString(detail.getOrder()), detail.getSort()));
//		} else {
//			pageable = setPaginationMetaData(detail.getPage(), detail.getSize());
//		}
//		return pageable;
//	}
//
//	private PageRequest setPaginationMetaData(Integer page, Integer size) {
//		if (page >= Constants.START_PAGE) {
//			return PageRequest.of(page - Constants.START_PAGE, size);
//		}
//		return null;
//	}
//
//	private PageRequest setPaginationMetaData(Integer page, Integer size, Sort sort) {
//		if (page >= Constants.START_PAGE) {
//			return PageRequest.of(page - Constants.START_PAGE, size, sort);
//		}
//		return null;
//	}

	public <T> ResponseEntity<T> getResponse(T payLoad, HttpStatus status) {
		return new ResponseEntity<>(payLoad, status);
	}

}
