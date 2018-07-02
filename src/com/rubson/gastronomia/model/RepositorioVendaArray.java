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
	public boolean inserir(Venda venda) {
		// TODO Auto-generated method stub
		
		try {
			
			this.vendas[indice] = venda;
			this.indice = this.indice + 1;
	
		} catch(Exception e) {
			
			return false;
			
		
		}
	
		return true;
		
	}

	@Override
	public boolean remover(String nomeCliente) {
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == nomeCliente) {
				
				vendas[i] = null;
				
				return true;
			
			}
			
		}
		
		return false;
	}

	@Override
	public String procurar(String nomeCliente) {
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == nomeCliente) {
				
				return vendas[i].toString();
			}
			
		}
		
		return null;
	}

	@Override
	public boolean atualizar(Venda venda) {
		// TODO Auto-generated method stub
		for(int i = 0; i < indice; i++) {
			
			if(vendas[i].getCliente().getNome() == venda.getCliente().getNome()) {
				
				vendas[i] = venda;
				return true;
			}
			
		}
		
		return false;

	}
	

	

}
