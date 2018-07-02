package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Cliente;

public interface RepositorioClientes {
	
	public boolean inserir(Cliente cliente);
	public boolean remover(String nomeCliente);
	public String procurar(String nomeCliente);
	public boolean atualizar(Cliente cliente);

}
