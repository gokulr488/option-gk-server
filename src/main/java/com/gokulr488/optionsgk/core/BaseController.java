package com.gokulr488.optionsgk.core;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ExceptionHandler;


public class BaseController {
	
	public static final Logger logger = LoggerFactory.getLogger(BaseController.class);
	
	@ExceptionHandler({ MisException.class })
	public ErrorResponse misExceptionHandler(MisException e) {
		ErrorResponse resp = new ErrorResponse();
		resp.setStatusCode(500);
		resp.setErrorMessage(e.getError().getErrorMessage());
		resp.setErrorDescription(e.getError().getErrorDescription());
		resp.setStatus(false);
		logErrorResponse(e);
		return resp;
	}

	@ExceptionHandler({ Exception.class })
	public ErrorResponse generalExceptionHandler(Exception e) {
		ErrorResponse resp = new ErrorResponse();
		resp.setStatusCode(500);
		resp.setErrorMessage(e.getLocalizedMessage());
		resp.setStatus(false);
		logErrorResponse(e);
		return resp;
	}

	@ExceptionHandler({ NumberFormatException.class })
	public ErrorResponse numberFormatExceptionHandler(NumberFormatException e) {
		ErrorResponse resp = new ErrorResponse();
		resp.setStatusCode(400);
		resp.setErrorMessage("Invalid Number Format");
		resp.setErrorDescription(e.getLocalizedMessage());
		resp.setStatus(false);
		logErrorResponse(resp, e);
		return resp;
	}

//	@ExceptionHandler({ JpaSystemException.class })
//	public ErrorResponse jpaSystemExceptionHandler(JpaSystemException e) {
//		ErrorResponse resp = new ErrorResponse();
//		resp.setStatusCode(400);
//		resp.setErrorMessage("Database Exception");
//		resp.setStatus(false);
//		logErrorResponse(resp, e);
//		return resp;
//	}

	private void logErrorResponse(Exception e) {
		logger.error("", e);
	}

	private void logErrorResponse(ErrorResponse resp, Exception e) {
		logger.error("Error Cause : {}", resp.getErrorMessage(), e);
	}
	
	public void checkPaginationDetails(BaseRequest request){
		if (request.getPaginationDetail() == null) {
			PagenationDetail paginationDetail = new PagenationDetail();
			paginationDetail.setPage(Constants.START_PAGE);
			paginationDetail.setSize(10);
			request.setPaginationDetail(paginationDetail);
		}
	}
//
//	public <T> PaginatedResponseWrapper<T> getPaginatedResponse(Page<T> responsePage,
//			PaginatedResponseWrapper<T> pagination) {
//
//		pagination.setContent(responsePage.getContent());
//		pagination.setLast(responsePage.isLast());
//		pagination.setFirst(responsePage.isFirst());
//		pagination.setSort(responsePage.getSort());
//		pagination.setPage(responsePage.getPageable().getPageNumber() + Constants.START_PAGE);
//		pagination.setSize(responsePage.getSize());
//		pagination.setTotalElements(responsePage.getTotalElements());
//		pagination.setTotalPages(responsePage.getTotalPages());
//		return pagination;
//	}

}
