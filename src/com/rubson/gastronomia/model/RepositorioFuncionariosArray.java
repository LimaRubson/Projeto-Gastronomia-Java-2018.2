package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Funcionario;

public class RepositorioFuncionariosArray implements RepositorioFuncionarios {

	private Funcionario[] funcionarios;
	private int indice;

	private final static int TAMANHO=100;
	
	public RepositorioFuncionariosArray() {
		this.funcionarios = new Funcionario[TAMANHO];
		this.indice = 0;
	}
	
	
	
	@Override
	public boolean inserir(Funcionario funcionario) {
		
		try {
			
			this.funcionarios[indice] = funcionario;
			this.indice = this.indice + 1;
	
		} catch(Exception e) {
			
			return false;
			
		
		}
	
		return true;
		
	}

	@Override
	public boolean remover(String nomeFuncionario) {
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == nomeFuncionario) {
				
				funcionarios[i] = null;
				
				return true;
			}
			
		}

		return false;
	}

	@Override
	public String procurar(String nomeFuncionario) {
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == nomeFuncionario) {
				
				return funcionarios[i].toString();
			}
			
		}
		
		return null;
	}

	@Override
	public boolean atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == funcionario.getNome()) {
				
				funcionarios[i] = funcionario;
				return true;
			}
			
		}
		
		return false;
		
	}


}
