package com.rubson.gastronomia.controller;

public class Fachada {
	
	private ControleClientes clientes;
	private ControleFuncionarios funcionarios;
	private ControlePratos pratos;
	private ControlePedidos pedidos;
	private ControleVendas vendas;
	private static Fachada instance;
	
	public Fachada() {
		clientes = new ControleClientes();
		funcionarios = new ControleFuncionarios();
		pedidos = new ControlePedidos();
		pratos = new ControlePratos();
		vendas = new ControleVendas();
	}
	
	public static Fachada getInstance(){
		if (Fachada.instance == null){
			Fachada.instance = new Fachada();
		}
		return Fachada.instance;
	}
	
	public void cadastrar(Cliente cliente) {
		clientes.cadastrar(cliente);
	}
	
	public boolean removerCliente(String nomeCliente) {
		if(clientes.remover(nomeCliente)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurarCliente(String nomeCliente) {
		return clientes.procurar(nomeCliente);
	}
	
	public boolean atualizar(Cliente cliente) {
		if(clientes.atualizar(cliente)) {
			return true;
		} else {
			return false;
		}
	}
	
	public void cadastrar(Funcionario funcionario) {
		funcionarios.inserir(funcionario);
	}
	
	public boolean removerFuncionario(String nomeCliente) {
		if(funcionarios.remover(nomeCliente)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurarFuncionario(String nomeFuncionario) {
		//Incluir validacoes e regras de negocio
		return funcionarios.procurar(nomeFuncionario);
	}
	
	public boolean atualizar(Funcionario funcionario) {
		
		if(funcionarios.atualizar(funcionario)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void cadastrar(Prato prato) {
		pratos.cadastrar(prato);
	}
	
	public boolean removerPrato(String nomePrato) {
		if(pratos.remover(nomePrato)) {
			return true;
		}else {
			return false;
		}
	}
	
	public Prato procurarPrato(String nomePrato) {
		return pratos.procurar(nomePrato);
	}
	
	public boolean atualizar(Prato prato) {
		
		if(pratos.atualizar(prato)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void cadastrar(Pedido pedido) {
		pedidos.inserir(pedido);
	}
	
	public boolean removerPedido(String idPedido) {
		if(pedidos.remover(idPedido)) {
			return true;
		}else {
			return false;
		}
	}
	
	public String procurarPedido(String idPedido) {
		return pedidos.procurar(idPedido);
	}
	
	public boolean atualizar(Pedido pedido) {
		
		if(pedidos.atualizar(pedido)) {
			return true;
		} else {
			return false;
		}
		
	}
	
	public void cadastrar(Venda venda) {
		vendas.cadastrar(venda);
	}
	
	public boolean removerVenda(String nomeCliente) {
		if(vendas.remover(nomeCliente)) {
			return true;
		} else {
			return false;
		}
	}
	
	public String procurarVenda(String nomeCliente) {
		return vendas.procurar(nomeCliente);
	}
	
	public boolean atualizar(Venda venda) {
		
		if(vendas.atualizar(venda)) {
			return true;
		} else {
			return false;
		}
		
	}

}
