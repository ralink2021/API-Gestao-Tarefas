package com.esig.gestaotarefa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esig.gestaotarefa.model.Tarefa;
import com.esig.gestaotarefa.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	TarefaRepository repository;
	
	public Tarefa saveTarefa(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
}
