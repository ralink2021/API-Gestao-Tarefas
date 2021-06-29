package com.esig.gestaotarefa.exception;

public class TarefaNotFoundException extends RuntimeException{
	
	public TarefaNotFoundException(Long id) {
		super("Tarefa com ID nao encontrada! " + id + "!");
	}

}
