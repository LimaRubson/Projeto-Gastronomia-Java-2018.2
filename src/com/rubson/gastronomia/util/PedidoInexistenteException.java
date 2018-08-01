package com.rubson.gastronomia.util;

public class PedidoInexistenteException extends Exception {
	
	private String idPedido;
	
	public PedidoInexistenteException(String idPedido) {
		super("Pedido inexistente");
		
		this.idPedido = idPedido;
		
	}

	public String getIdPedido() {
		return idPedido;
	}

	public void setIdPedido(String idPedido) {
		this.idPedido = idPedido;
	}
	

}
