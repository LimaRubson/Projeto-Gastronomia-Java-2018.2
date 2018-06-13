package com.rubson.gastronomia;

public interface RepositorioItensPratosList {
	
	public boolean cadastrarPrato(Prato prato);
	public boolean removerPrato(String nomePrato);
	public String procurarPrato(String nomePrato);
	
}
