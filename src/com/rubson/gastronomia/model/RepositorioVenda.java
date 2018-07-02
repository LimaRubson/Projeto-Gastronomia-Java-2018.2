package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Venda;

public interface RepositorioVenda {
	
	public boolean inserir(Venda venda);
	public boolean remover(String nomeCliente);
	public String procurar(String nomeCliente);
	public boolean atualizar(Venda venda);

}
