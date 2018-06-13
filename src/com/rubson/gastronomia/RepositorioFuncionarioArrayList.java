package com.rubson.gastronomia;

import java.util.ArrayList;

public class RepositorioFuncionarioArrayList implements RepositorioItensFuncionarioList {

	ArrayList<Funcionario> listaFuncionario = new ArrayList<Funcionario>();
	
	
	@Override
	public boolean cadastrarFuncionario(Funcionario funcionario) {
		
		try {
			
			listaFuncionario.add(funcionario);
			
		} catch(Exception e) {
			
			return false;
			
		}
		
		return true;
	}

	@Override
	public boolean removerFuncionario(String nomeFuncionario) {
		
		for(int i = 0; i < listaFuncionario.size(); i++) {
			
			if(listaFuncionario.get(i).getNome() == nomeFuncionario) {
				
				listaFuncionario.remove(i).getNome();
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	@Override
	public String procurarFuncionario(String nomeFuncionario) {
		
		String funcionario = null;
		
		for(int i = 0; i < listaFuncionario.size(); i++) {
			
			if(listaFuncionario.get(i).getNome() == nomeFuncionario) {
				
				funcionario = listaFuncionario.get(i).getNome();
				
			}
			
		}
		
		return funcionario;
		
	}

}
