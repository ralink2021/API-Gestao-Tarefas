package com.esig.gestaotarefa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.esig.gestaotarefa.model.Tarefa;
import com.esig.gestaotarefa.repository.TarefaRepository;

@Service
public class TarefaService {
	
	@Autowired
	TarefaRepository repository;
	
	/* Serviço para Salvar uma Tarefas */
	public Tarefa saveTarefa(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	/* Serviço para Listar todas as Tarefas */
	public List<Tarefa> findAll(){
		return repository.findAll();
	}
	
}
