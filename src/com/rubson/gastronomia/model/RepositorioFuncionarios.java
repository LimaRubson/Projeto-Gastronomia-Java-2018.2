package com.rubson.gastronomia.model;

import com.rubson.gastronomia.controller.Funcionario;

public interface RepositorioFuncionarios {
	
	public void inserir(Funcionario funcionario);
	public void remover(String nomefuncionario);
	public Funcionario procurar(String nomeFuncionario);
	public void atualizar(Funcionario funcionario);

}
