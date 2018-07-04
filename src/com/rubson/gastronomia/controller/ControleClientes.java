package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioClientes;
import com.rubson.gastronomia.model.RepositorioClientesArray;

public class ControleClientes {
	
	RepositorioClientes clientes = new RepositorioClientesArray();
	
	public void cadastrar(Cliente cliente) {
		clientes.inserir(cliente);
	}
	
	public void remover (String numero) {
		clientes.remover(numero);
	}
	
	public Cliente procurar(String nomeCliente) {
		return clientes.procurar(nomeCliente);
	}
	
	public void atualizar(Cliente cliente) {
		clientes.atualizar(cliente);
	}

}
