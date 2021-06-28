package com.esig.gestaotarefa.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esig.gestaotarefa.model.Tarefa;
import com.esig.gestaotarefa.service.TarefaService;

@RestController
@RequestMapping(value = "/tarefa")
public class TarefaController {
	
	@Autowired
	TarefaService serviceTarefa;
	
	/** Metodo POST - Para Salvar uma Tarefa */
	@PostMapping
	public Tarefa createTarefa(@RequestBody Tarefa tarefa) {
		return serviceTarefa.saveTarefa(tarefa);
		
	}

}
