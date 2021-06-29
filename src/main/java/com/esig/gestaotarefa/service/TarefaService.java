package com.esig.gestaotarefa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

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
	@Transactional(readOnly = true)
	public List<Tarefa> findAll(){
		return repository.findAll();
	}
	
	/* Serviço para Atualizar uma Tarefa */
	public Tarefa updateTarefa(Tarefa tarefa) {
		return repository.save(tarefa);
	}
	
	/* Serviço para Deletar uma Tarefa */
	@Transactional
	public void deleteTarefa(Long id) {
		repository.deleteById(id);
	}
	
}
