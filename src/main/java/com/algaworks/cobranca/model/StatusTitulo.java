package com.algaworks.cobranca.model;

public enum StatusTitulo {
	
	PENDENTE("Pendente"), 
	RECEBIDO("Recebido");
	
	private String descricao;

	StatusTitulo(String string) {
		this.descricao = descricao;
	}

	public String getDescricao() {
		return descricao;
	}


}
