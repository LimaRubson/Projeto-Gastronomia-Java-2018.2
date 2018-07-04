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
	public void inserir(Prato prato) {
			
			this.pratos[indice] = prato;
			this.indice = this.indice + 1;
	}

	@Override
	public void remover(String nomePrato) {
		
		for(int i = 0; i < indice; i++) {
					
					if(pratos[i].getNome() == nomePrato) {
						
						pratos[i] = null;
					
					}
					
				}

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
	public void atualizar(Prato prato) {
		for(int i = 0; i < indice; i++) {
			
			if(pratos[i].getNome() == prato.getNome()) {
				
				pratos[i] = prato;
			
			}
			
		}
		
	}

	

}
