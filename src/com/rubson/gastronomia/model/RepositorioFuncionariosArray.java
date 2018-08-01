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
	public void inserir(Funcionario funcionario) {
			
			this.funcionarios[indice] = funcionario;
			this.indice = this.indice + 1;
		
	}

	@Override
	public void remover(String nomeFuncionario) {
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == nomeFuncionario) {
				
				funcionarios[i] = null;
	
			}
			
		}

	}

	@Override
	public Funcionario procurar(String nomeFuncionario) {
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == nomeFuncionario && funcionarios[i] != null) {
				
				return funcionarios[i];
				
			}
			
		}
		
		return null;
	}

	@Override
	public void atualizar(Funcionario funcionario) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < indice; i++) {
			
			if(funcionarios[i].getNome() == funcionario.getNome()) {
				
				funcionarios[i] = funcionario;
			}
			
		}
		
	}


}
