package com.esig.gestaotarefa.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum PrioridadeTipos {
	
	ALTA("Alta"),
	MEDIA("Media"),
	BAIXA("Baixa");
	
	private String descricaoPrioridade;
}
