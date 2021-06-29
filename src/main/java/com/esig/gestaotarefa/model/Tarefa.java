package com.esig.gestaotarefa.model;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.esig.gestaotarefa.enums.PrioridadeTipos;
import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Tarefa {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private String titulo;
	
	@Column(nullable = false)
	private String descricao;
	
	@Column(nullable = false)
	private String responsavel;
	
	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private PrioridadeTipos prioridade;
	
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd/MM/yyyy")
	private LocalDate deadline;
	
	private String status;

}
