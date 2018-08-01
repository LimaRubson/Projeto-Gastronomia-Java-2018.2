package com.rubson.gastronomia.util;

public class ClienteInexistenteException extends Exception {
	
	private String nomeCliente;
	
	public ClienteInexistenteException(String nomeCliente) {
		
		super("Cliente Inexistente");
		this.nomeCliente = nomeCliente;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
