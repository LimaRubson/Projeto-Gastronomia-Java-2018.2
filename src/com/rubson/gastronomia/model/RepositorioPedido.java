package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Pedido;

public interface RepositorioPedido {
	
	public boolean inserir(Pedido pedido);
	public boolean remover(String idPedido);
	public String  procurar(String idPedido);
	public boolean atualizar(Pedido pedido);

}
