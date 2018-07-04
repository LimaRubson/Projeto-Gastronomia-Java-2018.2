package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPedido;
import com.rubson.gastronomia.model.RepositorioPedidoArray;

public class ControlePedidos {
	
RepositorioPedido pedidos = new RepositorioPedidoArray();
	
	public void inserir(Pedido pedido) {
		pedidos.inserir(pedido);
	}
	
	public void remover (String idPedido) {
		pedidos.remover(idPedido);
	}
	
	public Pedido procurar(String idPedido) {
		return pedidos.procurar(idPedido);
	}
	
	public void atualizar(Pedido pedido) {
		
		pedidos.atualizar(pedido);
		
	}

}
