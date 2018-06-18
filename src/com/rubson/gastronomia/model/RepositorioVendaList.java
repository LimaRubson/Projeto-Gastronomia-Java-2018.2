package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Venda;

public interface RepositorioVendaList {
	
	public boolean cadastrarVenda(Venda venda);
	public boolean removerVenda(String nomeCliente);
	public String procurarVenda(String nomeCliente);

}
