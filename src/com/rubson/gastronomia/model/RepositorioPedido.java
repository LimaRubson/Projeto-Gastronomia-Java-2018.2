package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Pedido;

public interface RepositorioPedido {
	
	public void inserir(Pedido pedido);
	public void remover(String idPedido);
	public Pedido  procurar(String idPedido);
	public void atualizar(Pedido pedido);

}
