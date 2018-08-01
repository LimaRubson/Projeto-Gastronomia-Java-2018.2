package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPedido;
import com.rubson.gastronomia.model.RepositorioPedidoArray;
import com.rubson.gastronomia.util.PedidoInexistenteException;

public class ControlePedidos {
	
RepositorioPedido pedidos = new RepositorioPedidoArray();
	
	public void inserir(Pedido pedido) {
		pedidos.inserir(pedido);
	}
	
	public void remover (String idPedido) {
		pedidos.remover(idPedido);
	}
	
	public Pedido procurar(String idPedido) throws PedidoInexistenteException {
		if(pedidos.procurar(idPedido) != null) {
			return pedidos.procurar(idPedido);
		} else {
			PedidoInexistenteException e;
			e = new PedidoInexistenteException(idPedido);
			
			throw e;
		}
	}
	
	public void atualizar(Pedido pedido) {
		
		pedidos.atualizar(pedido);
		
	}

}
