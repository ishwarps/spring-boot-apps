package com.springbootdemo.springbootdemo.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
public class BusinessUnitExceptionController {
	
	@ExceptionHandler(value=BusinessUnitNotFoundException.class)
	public ResponseEntity<Object> exception(BusinessUnitNotFoundException exception)
	{
		return new ResponseEntity<>	("BusinessUnit Not Found",HttpStatus.NOT_FOUND);
	}

}
