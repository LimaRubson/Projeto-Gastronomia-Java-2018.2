package com.rubson.gastronomia.controller;

import com.rubson.gastronomia.util.ClienteInexistenteException;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;
import com.rubson.gastronomia.util.PedidoInexistenteException;
import com.rubson.gastronomia.util.PratoInexistenteException;
import com.rubson.gastronomia.util.VendaInexistenteException;

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
	
	public void removerCliente(String nomeCliente) {
		clientes.remover(nomeCliente);
	}
	
	public Cliente procurarCliente(String nomeCliente) throws ClienteInexistenteException {
		return clientes.procurar(nomeCliente);
	}
	
	public void atualizar(Cliente cliente) {
		clientes.atualizar(cliente);
	}
	
	public void cadastrar(Funcionario funcionario) {
		funcionarios.inserir(funcionario);
	}
	
	public void removerFuncionario(String nomeCliente) {
		funcionarios.remover(nomeCliente);
	}
	
	public Funcionario procurarFuncionario(String nomeFuncionario) throws FuncionarioInexistenteException {
		return funcionarios.procurar(nomeFuncionario);
	}
	
	public void atualizar(Funcionario funcionario) {
		
		funcionarios.atualizar(funcionario);		
	}
	
	public void cadastrar(Prato prato) {
		pratos.cadastrar(prato);
	}
	
	public void removerPrato(String nomePrato) {
		pratos.remover(nomePrato);
	}
	
	public Prato procurarPrato(String nomePrato) throws PratoInexistenteException {
		return pratos.procurar(nomePrato);
	}
	
	public void atualizar(Prato prato) {
		
		pratos.atualizar(prato);
		
	}
	
	public void cadastrar(Pedido pedido) {
		pedidos.inserir(pedido);
	}
	
	public void removerPedido(String idPedido) {
		pedidos.remover(idPedido);
	}
	
	public Pedido procurarPedido(String idPedido) throws PedidoInexistenteException {
		return pedidos.procurar(idPedido);
	}
	
	public void atualizar(Pedido pedido) {
		
		pedidos.atualizar(pedido);
		
	}
	
	public void cadastrar(Venda venda) {
		vendas.cadastrar(venda);
	}
	
	public void removerVenda(String nomeCliente) {
		vendas.remover(nomeCliente);
	}
	
	public Venda procurarVenda(String nomeCliente) throws VendaInexistenteException {
		return vendas.procurar(nomeCliente);
	}
	
	public void atualizar(Venda venda) {
		vendas.atualizar(venda);
	}

}
