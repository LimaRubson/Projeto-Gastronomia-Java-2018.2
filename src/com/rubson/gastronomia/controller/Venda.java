package com.rubson.gastronomia.controller;

public class Venda {
	
	private Cliente cliente;
	private String dataVenda;
	private String horaVenda;
	private Pedido pedidoVendido;
	
	public Venda(Cliente cliente, String dataVenda, String horaVenda, Pedido pedidoVendido) {
		super();
		this.cliente = cliente;
		this.dataVenda = dataVenda;
		this.horaVenda = horaVenda;
		this.pedidoVendido = pedidoVendido;
	}
	
	public String getDataVenda() {
		return dataVenda;
	}
	public void setDataVenda(String dataVenda) {
		this.dataVenda = dataVenda;
	}
	public String getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(String horaVenda) {
		this.horaVenda = horaVenda;
	}
	public Pedido getPedidoVendido() {
		return pedidoVendido;
	}
	public void setPedidoVendido(Pedido pedidoVendido) {
		this.pedidoVendido = pedidoVendido;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	@Override
	public String toString() {
		return "Venda [getDataVenda()=" + getDataVenda() + ", getHoraVenda()=" + getHoraVenda()
				+ ", getPedidoVendido()=" + getPedidoVendido() + ", getCliente()=" + getCliente() + "]";
	}

}
