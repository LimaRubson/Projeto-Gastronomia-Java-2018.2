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
	public void inserir(Cliente cliente) {
		
			this.clientes[indice] = cliente;
			this.indice = this.indice + 1;
		
	}

	@Override
	public void remover(String nomeCliente) {
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == nomeCliente) {
				
				clientes[i] = null;
			
			}
			
		}

	}

	@Override
	public Cliente procurar(String nomeCliente) {
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == nomeCliente) {
				
				return clientes[i];
				
			}
			
		}
		
		return null;
	}

	@Override
	public void atualizar(Cliente cliente) {
		
		for(int i = 0; i < indice; i++) {
			
			if(clientes[i].getNome() == cliente.getNome()) {
				
				clientes[i] = cliente;
				
			}
			
		}

	}

}
