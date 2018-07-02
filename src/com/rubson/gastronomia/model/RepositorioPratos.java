package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Prato;

public interface RepositorioPratos {
	
	public boolean inserir(Prato prato);
	public boolean remover(String nomePrato);
	public Prato procurar(String nomePrato);
	public boolean atualizar(Prato prato);
	
}
