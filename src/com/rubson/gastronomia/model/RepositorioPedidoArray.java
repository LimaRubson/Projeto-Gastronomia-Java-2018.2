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
	public void inserir(Pedido pedido) {
			
			this.pedidos[indice] = pedido;
			this.indice = this.indice + 1;
		
	}



	@Override
	public void remover(String idPedido) {
		for(int i = 0; i < indice; i++) {
			
			if(pedidos[i].getId() == idPedido) {
				
				pedidos[i] = null;
				
			}
			
		}
		
	}



	@Override
	public Pedido procurar(String idPedido) {
	  for(int i = 0; i < indice; i++) {
			
			if(pedidos[i].getId() == idPedido && pedidos[i] != null) {
				
				return pedidos[i];
			}
			
		}
		
		return null;
	}


	@Override
	public void atualizar(Pedido pedido) {
		// TODO Auto-generated method stub
		
		 for(int i = 0; i < indice; i++) {
				
				if(pedidos[i].getId() == pedido.getId()) {
					
					pedidos[i] = pedido;
					
				}
				
			}
		
	 }

}

