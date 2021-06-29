package com.esig.gestaotarefa.dto.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.springframework.stereotype.Component;

import com.esig.gestaotarefa.dto.request.TarefaDTO;
import com.esig.gestaotarefa.model.Tarefa;

@Component
@Mapper(componentModel = "spring")
public interface TarefaMapper {
	
	@Mapping(target = "deadline", source = "deadline", dateFormat = "dd-MM-yyyy")
	Tarefa toModel(TarefaDTO dto);
	
	TarefaDTO toDTO(Tarefa dto);
}
