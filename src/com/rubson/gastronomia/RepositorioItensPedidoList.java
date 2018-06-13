package com.rubson.gastronomia;

public interface RepositorioItensPedidoList {
	
	public boolean cadastrarPedido(Pedido pedido);
	public boolean removerPedido(String nomePedido);
	public String  procurarPedido(String nomePedido);

}
