package com.esig.gestaotarefa.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.esig.gestaotarefa.dto.TarefaDTO;
import com.esig.gestaotarefa.model.Tarefa;
import com.esig.gestaotarefa.service.TarefaService;

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaController {
	
	@Autowired
	TarefaService serviceTarefa;
	
	/** Metodo POST - Para Salvar uma Tarefa */
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Tarefa createTarefa(@RequestBody Tarefa tarefa) {
		return serviceTarefa.saveTarefa(tarefa);
		
	}
	
	/** Metodo GET - Para Listagem das Tarefas */
	@GetMapping
	public List<Tarefa> getTarefaList(){
		return serviceTarefa.findAll();
		
	}
	
	/** Metodo PUT - Para Alterar uma Tarefa */
	@PutMapping("/{id}")
	@ResponseStatus(HttpStatus.OK)
	public Tarefa updateTarefa(@PathVariable Long id, @RequestBody Tarefa tarefa, @Valid TarefaDTO tarefaDTO) {
		return serviceTarefa.updateTarefa(tarefa);
	}
	
	/** Metodo DELETE - Para Deletar uma Tarefa */
	@DeleteMapping("/{id}")
	@ResponseStatus(HttpStatus.NO_CONTENT)
	public void deleteTarefa(@PathVariable Long id) {
		serviceTarefa.deleteTarefa(id);
	}
}
