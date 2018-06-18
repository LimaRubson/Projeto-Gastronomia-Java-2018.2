package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Prato;

public class RepositorioPratosArrayList implements RepositorioPratosList {

	ArrayList<Prato> listaPratos = new ArrayList<Prato>();
	
	@Override
	public boolean cadastrarPrato(Prato prato) {
		
		try {
			
			listaPratos.add(prato);
			
		} catch(Exception e) {
			
			return false;
			
		}
		
		return true;
		
	}

	@Override
	public boolean removerPrato(String nomePrato) {
		
		for(int i = 0; i < listaPratos.size(); i++) {
			
			if(listaPratos.get(i).getNome() == nomePrato) {
				
				//listaPratos.remove(i)
				
			}
			
		}
		
		return false;
	}

	@Override
	public String procurarPrato(String nomePrato) {
		
		String prato = null;
		
		for(int i = 0; i < listaPratos.size(); i++) {
			
			//if(listaPratos.get(i).getNome())
			
		}
		
		return null;
	}

}
