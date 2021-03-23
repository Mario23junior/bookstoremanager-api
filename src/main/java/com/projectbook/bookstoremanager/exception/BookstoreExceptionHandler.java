package com.projectbook.bookstoremanager.exception;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import javax.persistence.EntityExistsException;
import javax.persistence.EntityNotFoundException;

import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.http.converter.HttpMessageNotReadableException;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;


@ControllerAdvice
public class BookstoreExceptionHandler extends ResponseEntityExceptionHandler {
    
	@ExceptionHandler(EntityNotFoundException.class)
	public ResponseEntity<Object> handleEntityNotFoundExcepEntity(EntityNotFoundException exception) {
		return builderResponseEntity(
				     HttpStatus.FOUND,
				     exception.getMessage(),
				     Collections.singletonList(exception.getMessage()));
	}
	
	
	@ExceptionHandler(EntityExistsException.class)
	public ResponseEntity<Object> handleEntityExistsExcepEntity(EntityExistsException exception) {
		return builderResponseEntity(
				     HttpStatus.BAD_REQUEST,
				     exception.getMessage(),
				     Collections.singletonList(exception.getMessage()));
	}
	
	
	protected ResponseEntity<Object> handleMethodArgumentNotvalid(MethodArgumentNotValidException exceptionResponse,HttpHeaders headers,HttpStatus status, WebRequest request){
		List<String> errors = new ArrayList<>();
		exceptionResponse.getBindingResult().getFieldErrors()
		                  .forEach(fieldError -> errors.add
		                		  ("Campo "+ fieldError
		                				  .getField()
		                		          .toUpperCase() + " "+ fieldError.getDefaultMessage()));
		
		exceptionResponse.getBindingResult().getGlobalErrors()
        .forEach(globalErrors -> errors.add("Objeto "+ globalErrors.getObjectName().toUpperCase() + " "+ globalErrors.getDefaultMessage()));
		
		return builderResponseEntity(HttpStatus.BAD_REQUEST, " Informar argumento valido de erro", errors);
 	}
	
	@Override
	protected ResponseEntity<Object> handleHttpMessageNotReadable(HttpMessageNotReadableException exception,HttpHeaders headers, HttpStatus status, WebRequest request) {
		return builderResponseEntity(HttpStatus.BAD_REQUEST, "ERRO ao enviar formato json invalido / campo erro", Collections.singletonList(exception.getLocalizedMessage()));
 	}
	
	
	private ResponseEntity<Object> builderResponseEntity(HttpStatus httpStatus, String message, List<String> errors){
		ApiErros apiError = ApiErros.builder()
				.code(httpStatus.value())
				.status(httpStatus.getReasonPhrase())
				.message(message)
				.errors(errors)
				.timestamp(LocalDateTime.now())
 				.build();
		return ResponseEntity.status(httpStatus).body(apiError);
	}
} 
