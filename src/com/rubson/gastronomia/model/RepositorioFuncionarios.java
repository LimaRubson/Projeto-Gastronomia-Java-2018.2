package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Funcionario;

public interface RepositorioFuncionarios {
	
	public boolean inserir(Funcionario funcionario);
	public boolean remover(String nomefuncionario);
	public String procurar(String nomeFuncionario);
	public boolean atualizar(Funcionario funcionario);

}
