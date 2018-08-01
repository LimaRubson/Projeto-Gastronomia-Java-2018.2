package com.rubson.gastronomia.util;

public class PratoInexistenteException extends Exception {
	
	private String nomePrato;
	
	public PratoInexistenteException(String nomePrato) {
		super("Prato inexistente");
		this.nomePrato = nomePrato;
	}

	public String getNomePrato() {
		return nomePrato;
	}

	public void setNomePrato(String nomePrato) {
		this.nomePrato = nomePrato;
	}

}
