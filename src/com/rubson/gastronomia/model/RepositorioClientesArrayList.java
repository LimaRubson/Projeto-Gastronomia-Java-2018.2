package com.rubson.gastronomia.model;

import java.util.ArrayList;

import com.rubson.gastronomia.controller.Cliente;

public class RepositorioClientesArrayList implements RepositorioClientesList {
	
	ArrayList<Cliente> listaClientes = new ArrayList<Cliente>();

	@Override
	public boolean cadastrarCliente(Cliente cliente) {
		
		try {
			
				listaClientes.add(cliente);
		
		} catch(Exception e) {
			
			return false;
			
		
		}
		
		return true;
		
	}

	@Override
	public boolean removerCliente(String nomeCliente) {
		
		for(int i = 0; i < listaClientes.size(); i++) {
			
			if(listaClientes.get(i).getNome() == nomeCliente) {
				
				listaClientes.remove(i).getNome();
				
				return true;
				
			}
			
		}
		
		return false;
		
	}

	@Override
	public String procurarCliente(String nomeCliente) {
		
		String cliente = null;
		
		for(int i = 0; i < listaClientes.size(); i++) {
			
			if(listaClientes.get(i).getNome() == nomeCliente) {
				
				cliente = listaClientes.get(i).getNome();
				
			}
			
		}
		
		return cliente;
		
	}

}
