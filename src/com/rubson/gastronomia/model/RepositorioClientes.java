package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Cliente;

public interface RepositorioClientes {
	
	public void inserir(Cliente cliente);
	public void remover(String nomeCliente);
	public Cliente procurar(String nomeCliente);
	public void atualizar(Cliente cliente);

}
