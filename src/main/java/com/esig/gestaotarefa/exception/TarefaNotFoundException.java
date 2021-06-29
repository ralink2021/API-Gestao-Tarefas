package com.esig.gestaotarefa.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class TarefaNotFoundException extends Exception{
	
	public TarefaNotFoundException(Long id) {
		super(String.format("Tarefa com ID %s nao encontrada!", id));
	}

}
