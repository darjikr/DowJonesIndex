package com.krunaldarji.DowJonesIndex.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.krunaldarji.DowJonesIndex.exception.StockNotFoundException;

@ControllerAdvice
public class StockExceptionHandler {

	private static final Logger log = LoggerFactory.getLogger(StockExceptionHandler.class);
	
	@ExceptionHandler(value = {StockNotFoundException.class})
	public ResponseEntity<String> handleStockNotFoundException(StockNotFoundException ex) {
		log.error(ex.getMessage(),ex);
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.NOT_FOUND);
	}
	
	@ExceptionHandler(value = {Exception.class})
	public ResponseEntity<String> handleException(Exception ex) {
		log.error(ex.getMessage(),ex);
		return new ResponseEntity<String>(ex.getMessage(), HttpStatus.INTERNAL_SERVER_ERROR);
	}
		
	@ExceptionHandler(value = {HttpMessageNotReadableException.class})
	public ResponseEntity<Object> httpMessageNotReadableException(HttpMessageNotReadableException ex) {
		log.error(ex.getMessage(),ex);
		return new ResponseEntity<>("UNPROCESSABLE INPUT DATA", HttpStatus.UNPROCESSABLE_ENTITY);
	}

}
