package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Funcionario;

public interface RepositorioFuncionarioList {
	
	public boolean cadastrarFuncionario(Funcionario funcionario);
	public boolean removerFuncionario(String nomefuncionario);
	public String procurarFuncionario(String nomeFuncionario);

}
