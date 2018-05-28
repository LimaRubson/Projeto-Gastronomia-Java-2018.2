package com.rubson.gastronomia;

public class Pedido {
	
	private double valorTotalPedidos;
	private ItensPedidos itensPedidos;
	
	public Pedido(double valorTotalPedidos, ItensPedidos itensPedidos) {
		super();
		this.valorTotalPedidos = valorTotalPedidos;
		this.itensPedidos = itensPedidos;
	}

	public double getValorTotalPedidos() {
		return valorTotalPedidos;
	}

	public void setValorTotalPedidos(double valorTotalPedidos) {
		this.valorTotalPedidos = valorTotalPedidos;
	}

	public ItensPedidos getItensPedidos() {
		return itensPedidos;
	}

	public void setItensPedidos(ItensPedidos itensPedidos) {
		this.itensPedidos = itensPedidos;
	}

	@Override
	public String toString() {
		return "Pedido [valorTotalPedidos=" + valorTotalPedidos + ", itensPedidos=" + itensPedidos + "]";
	}

}
