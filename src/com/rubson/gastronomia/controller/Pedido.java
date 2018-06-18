package com.rubson.gastronomia.controller;

public class Pedido {
	
	private double valorTotalPedidos;
	private ItensPedido itensPedido;
	
	public Pedido(double valorTotalPedidos, ItensPedido itensPedidos) {
		super();
		this.valorTotalPedidos = valorTotalPedidos;
		this.itensPedido = itensPedidos;
	}

	public double getValorTotalPedidos() {
		return valorTotalPedidos;
	}

	public void setValorTotalPedidos(double valorTotalPedidos) {
		this.valorTotalPedidos = valorTotalPedidos;
	}

	public ItensPedido getItensPedidos() {
		return itensPedido;
	}

	public void setItensPedidos(ItensPedido itensPedidos) {
		this.itensPedido = itensPedidos;
	}
	
	public void criarPedido() {
		
	}
	
	public void encerrarPedido() {
		
	}
	
	public void cancelarPedido() {
		
	}
	
	

	@Override
	public String toString() {
		return "Pedido [valorTotalPedidos=" + valorTotalPedidos + ", itensPedidos=" + itensPedido + "]";
	}

}
