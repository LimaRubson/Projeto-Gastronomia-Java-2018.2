package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPratos;
import com.rubson.gastronomia.model.RepositorioPratosArray;

public class ControlePratos {
	
	RepositorioPratos pratos = new RepositorioPratosArray();
	
	public void cadastrar(Prato prato) {
		pratos.inserir(prato);
	}
	
	public void remover(String nomePrato) {
		pratos.remover(nomePrato);
	}
	
	public Prato procurar(String nomePrato) {
		return pratos.procurar(nomePrato);
	}
	
	public void atualizar(Prato prato) {
		pratos.atualizar(prato);
	}

}
