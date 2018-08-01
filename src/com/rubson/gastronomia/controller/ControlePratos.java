package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPratos;
import com.rubson.gastronomia.model.RepositorioPratosArray;
import com.rubson.gastronomia.util.PratoInexistenteException;

public class ControlePratos {
	
	RepositorioPratos pratos = new RepositorioPratosArray();
	
	public void cadastrar(Prato prato) {
		pratos.inserir(prato);
	}
	
	public void remover(String nomePrato) {
		pratos.remover(nomePrato);
	}
	
	public Prato procurar(String nomePrato) throws PratoInexistenteException {
		if(pratos.procurar(nomePrato) != null) {
			return pratos.procurar(nomePrato);
		} else {
			
			PratoInexistenteException e;
			e = new PratoInexistenteException(nomePrato);
			
			throw e;
			
		}
	}
	
	public void atualizar(Prato prato) {
		pratos.atualizar(prato);
	}

}
