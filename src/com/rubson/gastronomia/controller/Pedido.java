package com.rubson.gastronomia.controller;

import java.util.Arrays;

public class Pedido {
	private String id;
	private double valorTotalPedidos;
	private ItensPedido[] itensPedido;
	
	public Pedido(String id, double valorTotalPedidos, ItensPedido[] itensPedido) {
		super();
		this.id = id;
		this.valorTotalPedidos = valorTotalPedidos;
		this.itensPedido = itensPedido;
		
	}

	public double getValorTotalPedidos() {
		return valorTotalPedidos;
	}

	public void setValorTotalPedidos(double valorTotalPedidos) {
		this.valorTotalPedidos = valorTotalPedidos;
	}
	

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public ItensPedido getItensPedido() {
		for(int i = 0; i < itensPedido.length; i++) {
			
			if(itensPedido[i] != null) {
				return itensPedido[i];
			
			} 
		}
		
		return null;
		
	}

	public void setItensPedido(ItensPedido[] itensPedido) {
		this.itensPedido = itensPedido;
	}

	@Override
	public String toString() {
		return "Pedido [getValorTotalPedidos()=" + getValorTotalPedidos() + ", getId()=" + getId()
				+ ", getItensPedido()=" + getItensPedido() + "]";
	}

}
