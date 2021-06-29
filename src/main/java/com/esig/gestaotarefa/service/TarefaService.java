package com.esig.gestaotarefa.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esig.gestaotarefa.exception.TarefaNotFoundException;
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
	
	/* Serviço para Buscar uma Tarefa por ID */
	public Optional<Tarefa> findById(Long id) throws TarefaNotFoundException{
		Optional<Tarefa> tarefa = repository.findById(id);
		if(!tarefa.isPresent()) {
			throw new TarefaNotFoundException(id);
		} else {
			return repository.findById(id);
		}
		
	}
	
	/* Serviço para Atualizar uma Tarefa */
	public Tarefa updateTarefa(Long id,Tarefa tarefa) {
		Optional<Tarefa> tarefaOptional = repository.findById(id);
		if(!tarefaOptional.isPresent()) {
			throw new TarefaNotFoundException(id);
		} else {
			repository.findById(id);
			return repository.save(tarefa);
		}
	}
	
	/* Serviço para Deletar uma Tarefa */
	@Transactional
	public void deleteTarefa(Long id) {
		repository.deleteById(id);
	}
	
}
