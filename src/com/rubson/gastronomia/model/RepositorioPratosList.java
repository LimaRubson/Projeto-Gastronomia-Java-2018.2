package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Prato;

public interface RepositorioPratosList {
	
	public boolean cadastrarPrato(Prato prato);
	public boolean removerPrato(String nomePrato);
	public String procurarPrato(String nomePrato);
	
}
