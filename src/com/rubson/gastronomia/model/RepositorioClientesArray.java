package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Cliente;

public class RepositorioClientesArray implements RepositorioClientes {
	
	private Cliente[] clientes;
	private int indice;

	private final static int TAMANHO=100;
	
	public RepositorioClientesArray() {
		this.clientes = new Cliente[TAMANHO];
		this.indice = 0;
	}
	
	@Override
	public boolean inserir(Cliente cliente) {
		
		try {
			
			this.clientes[indice] = cliente;
			this.indice = this.indice + 1;
	
		} catch(Exception e) {
			
			return false;
			
		
		}
	
		return true;
		
	}

	@Override
	public boolean remover(String nomeCliente) {
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == nomeCliente) {
				
				clientes[i] = null;
				
				return true;
			
			}
			
		}
		
		return false;
	}

	@Override
	public String procurar(String nomeCliente) {
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == nomeCliente) {
				
				return clientes[i].toString();
				
			}
			
		}
		
		return null;
	}

	@Override
	public boolean atualizar(Cliente cliente) {
	  // TODO Auto-generated method stub
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == cliente.getNome()) {
				
				clientes[i] = cliente;
				return true;
				
			}
			
		}
		
		return false;
		
	}

}
