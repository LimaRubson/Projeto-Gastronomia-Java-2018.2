package com.rubson.gastronomia;

public interface RepositorioItensFuncionarioList {
	
	public boolean cadastrarFuncionario(Funcionario funcionario);
	public boolean removerFuncionario(String nomefuncionario);
	public String procurarFuncionario(String nomeFuncionario);

}
