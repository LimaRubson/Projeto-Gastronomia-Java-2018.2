package com.rubson.gastronomia;

public interface RepositorioItensClientesList {
	
	public boolean cadastrarCliente(Cliente cliente);
	public boolean removerCliente(String nomeCliente);
	public String procurarCliente(String nomeCliente);

}
