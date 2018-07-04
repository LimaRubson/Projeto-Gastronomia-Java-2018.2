package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Prato;

public interface RepositorioPratos {
	
	public void inserir(Prato prato);
	public void remover(String nomePrato);
	public Prato procurar(String nomePrato);
	public void atualizar(Prato prato);
	
}
