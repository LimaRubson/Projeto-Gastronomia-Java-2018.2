package com.rubson.gastronomia.model;

/*

import java.util.ArrayList;

public class RepositorioPedidoArrayList implements RepositorioItensPedidoList {

	ArrayList<Pedido> listaPedido = new ArrayList<Pedido>();
	
	@Override
	public boolean cadastrarPedido(Pedido pedido) {
		
		try {
			
			listaPedido.add(pedido);
			
		} catch(Exception e) {
			
			return false;
			
		}
		
		
		return true;
		
	}

	@Override
	public boolean removerPedido(String nomePedido) {
		
		for(int i = 0; i < listaPedido.size(); i++) {
			
			if(listaPedido.get(i).getItensPedidos().getPrato().getNome() == nomePedido) {
				
				listaPedido.remove(i).getItensPedidos().getPrato();
				
				return true;
				
			}
			
		}
		
		return false;
	}

	@Override
	public String procurarPedido(String nomePedido) {
		
		
		String pedido = null;
		
		for(int i = 0; i < listaPedido.size(); i++) {
			
			if(listaPedido.get(i).getItensPedidos().getPrato().getNome() == nomePedido) {
				
				pedido = listaPedido.get(i).getItensPedidos().getPrato().getNome();
				
			}
			
		}
        	
		return pedido;
	}

}

*/
