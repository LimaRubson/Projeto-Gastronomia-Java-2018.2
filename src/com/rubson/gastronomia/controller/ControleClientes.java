package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioClientes;
import com.rubson.gastronomia.model.RepositorioClientesArray;
import com.rubson.gastronomia.util.ClienteInexistenteException;

public class ControleClientes {
	
	RepositorioClientes clientes = new RepositorioClientesArray();
	
	public void cadastrar(Cliente cliente) {
		clientes.inserir(cliente);
	}
	
	public void remover (String numero) {
		clientes.remover(numero);
	}
	
	public Cliente procurar(String nomeCliente) throws ClienteInexistenteException {
		if(clientes.procurar(nomeCliente) != null) {
			
			return clientes.procurar(nomeCliente);
			
		}else {
			
			ClienteInexistenteException e;
			e = new ClienteInexistenteException(nomeCliente);
			
			throw e;
			
		}
	}
	
	public void atualizar(Cliente cliente) {
		clientes.atualizar(cliente);
	}
	

}
