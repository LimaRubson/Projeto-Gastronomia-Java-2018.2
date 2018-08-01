package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioVenda;
import com.rubson.gastronomia.model.RepositorioVendaArray;
import com.rubson.gastronomia.util.VendaInexistenteException;

public class ControleVendas {
	
	RepositorioVenda vendas = new RepositorioVendaArray();
	
	public void cadastrar(Venda venda) {
		vendas.inserir(venda);
	}
	
	public void remover(String nomeCliente) {
		vendas.remover(nomeCliente);
	}
	
	public Venda procurar(String nomeCliente) throws VendaInexistenteException {
		if(vendas.procurar(nomeCliente) != null) {
			
			return vendas.procurar(nomeCliente);
			
		} else {
			
			VendaInexistenteException e;
			e = new VendaInexistenteException(nomeCliente);
			
			throw e;
			
		}
	}
	
	public void atualizar(Venda venda) {
		
		vendas.atualizar(venda);
		
	}

}
