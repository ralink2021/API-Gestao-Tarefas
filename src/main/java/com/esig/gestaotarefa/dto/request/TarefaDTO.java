package com.esig.gestaotarefa.dto.request;

import java.time.LocalDate;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
	@Size(min = 2, max = 100)
	private String titulo;
	
	@NotEmpty
	@Size(min = 2, max = 150)
	private String descricao;

	@NotEmpty
	@Size(min = 2, max = 20)
	private String responsavel;
	
	@Enumerated(EnumType.STRING)
	private PrioridadeTipos prioridade;
	
	@NotNull
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate deadline;
	
	private String status;
}
