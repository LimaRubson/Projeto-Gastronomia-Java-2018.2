package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Pedido;

public interface RepositorioPedidoList {
	
	public boolean cadastrarPedido(Pedido pedido);
	public boolean removerPedido(String nomePedido);
	public String  procurarPedido(String nomePedido);

}
