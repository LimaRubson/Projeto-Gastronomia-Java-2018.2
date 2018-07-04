package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioFuncionarios;
import com.rubson.gastronomia.model.RepositorioFuncionariosArray;

public class ControleFuncionarios {
	
	RepositorioFuncionarios funcionarios = new RepositorioFuncionariosArray();
	
	public void inserir(Funcionario funcionario) {
		funcionarios.inserir(funcionario);
	}
	
	public void remover (String numero) {
		funcionarios.remover(numero);
			
	}
	
	public Funcionario procurar(String nomeFuncionario) {
		return funcionarios.procurar(nomeFuncionario);
	}
	
	public void atualizar(Funcionario funcionario) {
		
		funcionarios.atualizar(funcionario);
		
	}

}
