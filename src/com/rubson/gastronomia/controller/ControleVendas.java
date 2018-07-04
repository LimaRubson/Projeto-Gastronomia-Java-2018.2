package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioVenda;
import com.rubson.gastronomia.model.RepositorioVendaArray;

public class ControleVendas {
	
	RepositorioVenda vendas = new RepositorioVendaArray();
	
	public void cadastrar(Venda venda) {
		vendas.inserir(venda);
	}
	
	public void remover(String nomeCliente) {
		vendas.remover(nomeCliente);
	}
	
	public Venda procurar(String nomeCliente) {
		return vendas.procurar(nomeCliente);
	}
	
	public void atualizar(Venda venda) {
		
		vendas.atualizar(venda);
		
	}

}
