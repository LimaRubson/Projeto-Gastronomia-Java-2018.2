package com.rubson.gastronomia;

public class ItensPedido {
	
	private int quantidadePrato;
	private Prato prato;
	private double valorTotal;
	private int quantidadeItensPedidos;
	
	public ItensPedido(int quantidadePrato, Prato prato, double valorTotal, int quantidadeItensPedidos) {
		super();
		this.quantidadePrato = quantidadePrato;
		this.prato = prato;
		this.valorTotal = valorTotal;
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}

	public int getQuantidadePrato() {
		return quantidadePrato;
	}

	public void setQuantidadePrato(int quantidadePrato) {
		this.quantidadePrato = quantidadePrato;
	}

	public Prato getPrato() {
		return prato;
	}

	public void setPrato(Prato prato) {
		this.prato = prato;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}

	public int getQuantidadeItensPedidos() {
		return quantidadeItensPedidos;
	}

	public void setQuantidadeItensPedidos(int quantidadeItensPedidos) {
		this.quantidadeItensPedidos = quantidadeItensPedidos;
	}
	
	public void inserirPedido() {
		
	}
	
	public Pedido atualizarPedido(Pedido pedido) {
		
		return pedido;
		
	}
	
	public Pedido procurarPedido(Pedido pedido) {
		
		return pedido;
		
	}
	
	public void removerPedido() {
		
	}

	@Override
	public String toString() {
		return "ItensPedidos [quantidadePrato=" + quantidadePrato + ", prato=" + prato + ", valorTotal=" + valorTotal
				+ ", quantidadeItensPedidos=" + quantidadeItensPedidos + "]";
	}

}
