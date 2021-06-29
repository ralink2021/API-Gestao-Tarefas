package com.esig.gestaotarefa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.esig.gestaotarefa.dto.mapper.TarefaMapper;
import com.esig.gestaotarefa.dto.request.TarefaDTO;
import com.esig.gestaotarefa.dto.response.MessageResponseDTO;
import com.esig.gestaotarefa.exception.TarefaNotFoundException;
import com.esig.gestaotarefa.model.Tarefa;
import com.esig.gestaotarefa.repository.TarefaRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class TarefaService {
	
	private final TarefaRepository repository;
	
	private final TarefaMapper tarefaMapper;
	
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
	public MessageResponseDTO updateTarefa(Long id, TarefaDTO tarefaDTO) throws TarefaNotFoundException{
		repository.findById(id).orElseThrow(() -> new TarefaNotFoundException(id));
		Tarefa updateTarefa = tarefaMapper.toModel(tarefaDTO);
		Tarefa savedTarefa = repository.save(updateTarefa);
		MessageResponseDTO messageResponse = createMessageResponse("Tarefa alterada com Sucesso com ID ", savedTarefa.getId());
		return messageResponse;
		
	}
	
	/* Serviço para Deletar uma Tarefa */
	@Transactional
	public void deleteTarefa(Long id) {
		repository.deleteById(id);
	}
	
	private MessageResponseDTO createMessageResponse(String s, Long id2) {
        return MessageResponseDTO.builder()
                .message(s + id2)
                .build();
    }
	
}
