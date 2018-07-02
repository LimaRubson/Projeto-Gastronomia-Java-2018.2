package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioPratos;
import com.rubson.gastronomia.model.RepositorioPratosArray;

public class ControlePratos {
	
	RepositorioPratos pratos = new RepositorioPratosArray();
	
	public void cadastrar(Prato prato) {
		pratos.inserir(prato);
	}
	
	public boolean remover(String nomePrato) {
		if(pratos.remover(nomePrato)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Prato procurar(String nomePrato) {
		return pratos.procurar(nomePrato);
	}
	
	public boolean atualizar(Prato prato) {
		if(pratos.atualizar(prato)) {
			return true;
		} else {
			return false;
		}
	}

}
