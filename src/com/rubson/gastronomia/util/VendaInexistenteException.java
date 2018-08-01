package com.rubson.gastronomia.util;

public class VendaInexistenteException extends Exception {
	
	private String nomeCliente;
	
	public VendaInexistenteException(String nomeCliente) {
		
		super("Venda Inexistente");
		this.nomeCliente = nomeCliente;
		
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
