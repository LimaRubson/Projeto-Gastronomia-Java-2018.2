package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Cliente;

public interface RepositorioClientesList {
	
	public boolean cadastrarCliente(Cliente cliente);
	public boolean removerCliente(String nomeCliente);
	public String procurarCliente(String nomeCliente);

}
