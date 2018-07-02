package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPedido;
import com.rubson.gastronomia.model.RepositorioPedidoArray;

public class ControlePedidos {
	
RepositorioPedido pedidos = new RepositorioPedidoArray();
	
	public void inserir(Pedido pedido) {
		pedidos.inserir(pedido);
	}
	
	public boolean remover (String idPedido) {
		if(pedidos.remover(idPedido)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurar(String idPedido) {
		return pedidos.procurar(idPedido);
	}
	
	public boolean atualizar(Pedido pedido) {
		
		if(pedidos.atualizar(pedido)) {
			return true;
		} else {
			return false;
		}
		
	}

}
