package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.Pedido;

public class RepositorioPedidoArray implements RepositorioPedido {

	private Pedido[] pedidos;
	private int indice;

	private final static int TAMANHO=100;
	
	public RepositorioPedidoArray() {
		this.pedidos = new Pedido[TAMANHO];
		this.indice = 0;
	}
	

	@Override
	public boolean inserir(Pedido pedido) {
		try {
			
			this.pedidos[indice] = pedido;
			this.indice = this.indice + 1;
	
		} catch(Exception e) {
			
			return false;
			
		
		}
	
		return true;
		
	}



	@Override
	public boolean remover(String idPedido) {
		for(int i = 0; i < indice; i++) {
			
			if(pedidos[i].getId() == idPedido) {
				
				pedidos[i] = null;
				
				return true;
			}
			
		}

		return false;
	}



	@Override
	public String procurar(String idPedido) {
	  for(int i = 0; i < indice; i++) {
			
			if(pedidos[i].getId() == idPedido) {
				
				return pedidos[i].toString();
			}
			
		}
		
		return null;
	}


	@Override
	public boolean atualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		
		 for(int i = 0; i < indice; i++) {
				
				if(pedidos[i].getId() == pedido.getId()) {
					
					pedidos[i] = pedido;
					return true;
					
				}
				
			}
		 
		 return false;
		
	 }

}

