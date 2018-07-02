package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioClientes;
import com.rubson.gastronomia.model.RepositorioClientesArray;

public class ControleClientes {
	
	RepositorioClientes clientes = new RepositorioClientesArray();
	
	public void cadastrar(Cliente cliente) {
		clientes.inserir(cliente);
	}
	
	public boolean remover (String numero) {
		if(clientes.remover(numero)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurar(String nomeCliente) {
		return clientes.procurar(nomeCliente);
	}
	
	public boolean atualizar(Cliente cliente) {
		
		if(clientes.atualizar(cliente)) {
			return true;
		} else {
			return false;
		}
		
	}

}
