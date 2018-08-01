package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioFuncionarios;
import com.rubson.gastronomia.model.RepositorioFuncionariosArray;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;

public class ControleFuncionarios {
	
	RepositorioFuncionarios funcionarios = new RepositorioFuncionariosArray();
	
	public void inserir(Funcionario funcionario) {
		funcionarios.inserir(funcionario);
	}
	
	public void remover (String numero) {
		funcionarios.remover(numero);
			
	}
	
	public Funcionario procurar(String nomeFuncionario) throws FuncionarioInexistenteException {
		
		if(funcionarios.procurar(nomeFuncionario) != null) {
			
			return funcionarios.procurar(nomeFuncionario);
			
		} else {
			FuncionarioInexistenteException e;
			e = new FuncionarioInexistenteException(nomeFuncionario);
			
			throw e;
			
		}
		
	}
	
	public void atualizar(Funcionario funcionario) {
		
		funcionarios.atualizar(funcionario);
		
	}

}
