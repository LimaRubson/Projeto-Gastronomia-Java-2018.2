package com.rubson.gastronomia;

public interface RepositorioVendaList {
	
	public boolean cadastrarVenda(Venda venda);
	public boolean removerVenda(String nomeCliente);
	public String procurarVenda(String nomeCliente);

}
