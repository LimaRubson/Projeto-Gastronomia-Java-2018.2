package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.model.RepositorioFuncionarios;
import com.rubson.gastronomia.model.RepositorioFuncionariosArray;

public class ControleFuncionarios {
	
	RepositorioFuncionarios funcionarios = new RepositorioFuncionariosArray();
	
	public void inserir(Funcionario funcionario) {
		funcionarios.inserir(funcionario);
	}
	
	public boolean remover (String numero) {
		if(funcionarios.remover(numero)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurar(String nomeFuncionario) {
		return funcionarios.procurar(nomeFuncionario);
	}
	
	public boolean atualizar(Funcionario funcionario) {
		
		if(funcionarios.atualizar(funcionario)) {
			return true;
		} else {
			return false;
		}
		
	}

}
