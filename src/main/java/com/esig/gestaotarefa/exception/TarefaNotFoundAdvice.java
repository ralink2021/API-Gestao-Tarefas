package com.esig.gestaotarefa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

@ControllerAdvice
public class TarefaNotFoundAdvice {
	
	@ResponseBody
	@ExceptionHandler(TarefaNotFoundException.class)
	@ResponseStatus(HttpStatus.NOT_FOUND)
	String tarefaNotFoundHandler(TarefaNotFoundException exception) {
		return exception.getMessage();
	}
}
