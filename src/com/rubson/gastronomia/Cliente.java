package com.rubson.gastronomia;

public class Cliente extends Pessoa {
	
	private Pedido pedido;
	private String tipoCliente;
	
	public Cliente(String nome, String cpf, String rg, String sexo, String endereco, String email, String telefone,
		     String observacoes, Pedido pedido, String tipoCliente) {
		super(nome, cpf, rg, sexo, endereco, email, telefone, observacoes);
		this.pedido = pedido;
		this.tipoCliente = tipoCliente;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getTipoCliente() {
		return tipoCliente;
	}
	public void setTipoCliente(String tipoCliente) {
		this.tipoCliente = tipoCliente;
	}
	
	@Override
	public String toString() {
		return "Cliente [pedido=" + pedido + ", tipoCliente=" + tipoCliente + "]";
	}
	
	
}