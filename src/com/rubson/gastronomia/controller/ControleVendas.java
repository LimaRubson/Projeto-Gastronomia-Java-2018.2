package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioVenda;
import com.rubson.gastronomia.model.RepositorioVendaArray;

public class ControleVendas {
	
	RepositorioVenda vendas = new RepositorioVendaArray();
	
	public void cadastrar(Venda venda) {
		vendas.inserir(venda);
	}
	
	public boolean remover(String nomeCliente) {
		if(vendas.remover(nomeCliente)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurar(String nomeCliente) {
		return vendas.procurar(nomeCliente);
	}
	
	public boolean atualizar(Venda venda) {
		
		if(vendas.atualizar(venda)) {
			return true;
		} else {
			return false;
		}
		
	}

}
