package com.esig.gestaotarefa.dto;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.esig.gestaotarefa.enums.PrioridadeTipos;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class TarefaDTO {
	
	private Long id;
	
	@NotEmpty
	private String titulo;
	
	@NotEmpty
	private String descricao;

	@NotEmpty
	private String responsavel;
	
	@Enumerated(EnumType.STRING)
	private PrioridadeTipos prioridade;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate deadline;
	
	private String status;
}
