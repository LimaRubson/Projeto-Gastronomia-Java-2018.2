package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Venda;

public interface RepositorioVenda {
	
	public void inserir(Venda venda);
	public void remover(String nomeCliente);
	public Venda procurar(String nomeCliente);
	public void atualizar(Venda venda);

}
