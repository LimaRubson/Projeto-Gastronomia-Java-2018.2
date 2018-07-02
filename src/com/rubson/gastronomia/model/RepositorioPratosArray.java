package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.Prato;

public class RepositorioPratosArray implements RepositorioPratos {
	
	private Prato[] pratos;
	private int indice;

	private final static int TAMANHO=100;
	
	public RepositorioPratosArray() {
		this.pratos = new Prato[TAMANHO];
		this.indice = 0;
	}

	@Override
	public boolean inserir(Prato prato) {
		try {
			
			this.pratos[indice] = prato;
			this.indice = this.indice + 1;
	
		} catch(Exception e) {
			
			return false;
			
		
		}
	
		return true;
	}

	@Override
	public boolean remover(String nomePrato) {
		
		for(int i = 0; i < indice; i++) {
					
					if(pratos[i].getNome() == nomePrato) {
						
						pratos[i] = null;
						
						return true;
					
					}
					
				}
		
		return false;
	}

	@Override
	public Prato procurar(String nomePrato) {
		
		for(int i = 0; i < indice; i++) {
			
			if(pratos[i].getNome() == nomePrato) {
				
				return pratos[i];
			}
			
		}
		
		return null;
	}

	@Override
	public boolean atualizar(Prato prato) {
		// TODO Auto-generated method stub
		
		for(int i = 0; i < indice; i++) {
			
			if(pratos[i].getNome() == prato.getNome()) {
				
				pratos[i] = prato;
				return true;
			}
			
		}
		
		return false;
		
	}

	

}
