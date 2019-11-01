package com.cg.ems.ExpenseCodeModule.exception;

import java.sql.Date;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;




	@RestControllerAdvice
	public class ExceptionController extends ResponseEntityExceptionHandler {
		
		@ExceptionHandler(ExpenseDetailsNotFound.class)
		public ResponseEntity<ErrorDetails> handleIDNotFoundException(Exception ex, WebRequest request) {
		    ErrorDetails errorDetails = new ErrorDetails(new Date(0), ex.getMessage(),request.getDescription(false));
		        return new ResponseEntity<>(errorDetails, HttpStatus.NOT_FOUND);
		        //	Response Entity for Not Found Status 404 in POSTMAN.
		}
	}

