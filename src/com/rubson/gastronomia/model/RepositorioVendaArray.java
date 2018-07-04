package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Venda;

public class RepositorioVendaArray implements RepositorioVenda {
	
	private Venda[] vendas;
	private int indice;
	
	private final static int TAMANHO=100;
	
	public RepositorioVendaArray() {
		this.vendas = new Venda[TAMANHO];
		this.indice = 0;
	}

	@Override
	public void inserir(Venda venda) {
			
			this.vendas[indice] = venda;
			this.indice = this.indice + 1;
		
	}

	@Override
	public void remover(String nomeCliente) {
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == nomeCliente) {
				
				vendas[i] = null;
			
			}
			
		}
		
	}

	@Override
	public Venda procurar(String nomeCliente) {
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == nomeCliente) {
				
				return vendas[i];
			}
			
		}
		
		return null;
	}

	@Override
	public void atualizar(Venda venda) {
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == venda.getCliente().getNome()) {
				
				vendas[i] = venda;
			}
			
		}

	}

}
