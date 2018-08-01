package com.rubson.gastronomia.util;

public class FuncionarioInexistenteException extends Exception {
	
	private String nomeFuncionario;
	
	public FuncionarioInexistenteException(String nomeFuncionario) {
		
		super("Funcionário Inexistente");
		this.nomeFuncionario = nomeFuncionario;
			
	}

	public String getNomeFuncionario() {
		return nomeFuncionario;
	}

	public void setNomeFuncionario(String nomeFuncionario) {
		this.nomeFuncionario = nomeFuncionario;
	}

}
