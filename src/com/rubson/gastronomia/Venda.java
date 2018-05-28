package com.rubson.gastronomia;

public class Venda {
	
	private Cliente cliente;
	private String dataVenda;
	private double horaVenda;
	private Pedido pedidoVendido;
	
	public Venda(Cliente cliente, String dataVenda, double horaVenda, Pedido pedidoVendido) {
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
	public double getHoraVenda() {
		return horaVenda;
	}
	public void setHoraVenda(double horaVenda) {
		this.horaVenda = horaVenda;
	}
	public Pedido getPedidoVendido() {
		return pedidoVendido;
	}
	public void setPedidoVendido(Pedido pedidoVendido) {
		this.pedidoVendido = pedidoVendido;
	}


	@Override
	public String toString() {
		return "Venda [cliente=" + cliente + ", dataVenda=" + dataVenda + ", horaVenda=" + horaVenda
				+ ", pedidoVendido=" + pedidoVendido + "]";
	}

}
