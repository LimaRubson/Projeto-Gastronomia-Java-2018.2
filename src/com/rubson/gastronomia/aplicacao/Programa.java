package com.rubson.gastronomia.aplicacao;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.controller.Venda;

public class Programa {

	public static void main(String[] args) {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(cliente);
		Fachada.getInstance().cadastrar(funcionario);
		Fachada.getInstance().cadastrar(prato);
		Fachada.getInstance().cadastrar(pedido);
		Fachada.getInstance().cadastrar(venda);
		
		System.out.println("\n########  Dados Cadastrados  ########\n");
		System.out.println(Fachada.getInstance().procurarCliente("Pedro"));
		System.out.println(Fachada.getInstance().procurarFuncionario("Rubson"));
		System.out.println(Fachada.getInstance().procurarPrato("Torta Salgada"));
		System.out.println(Fachada.getInstance().procurarPedido("0"));
		System.out.println(Fachada.getInstance().procurarVenda("Pedro"));
		
		Prato pratoAtualizado = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedidoAtualizado = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(3, pratoAtualizado, 100, 4);
		Pedido pedidoAtualizado = new Pedido("0", 20, itensPedidoAtualizado);
		Funcionario funcionarioAtualizado = new Funcionario("Rubson", "10894476479", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0876", "Ola", 6, 1200, pedidoAtualizado, "Garcom");
		Cliente clienteAtualizado = new Cliente("Pedro", "10894476473", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@gmail.com", "3443-7734", "Oi", "VIP", pedidoAtualizado);
		Venda vendaAtualizado = new Venda(cliente, "02/06/2018", "09:40", pedidoAtualizado);
		
		System.out.println("\n########  atualização dos dados  ########\n");
		System.out.println("Cliente atualizado com sucesso? " + Fachada.getInstance().atualizar(clienteAtualizado));
		System.out.println("Funcionário atualizado com sucesso? " + Fachada.getInstance().atualizar(funcionarioAtualizado));
		System.out.println("Prato atualizado com sucesso? " + Fachada.getInstance().atualizar(pratoAtualizado));
		System.out.println("Pedido atualizado com sucesso? " + Fachada.getInstance().atualizar(pedidoAtualizado));
		System.out.println("Venda atualizado com sucesso? " + Fachada.getInstance().atualizar(vendaAtualizado));
		
		System.out.println("\n########  Dados Atualizados  ########\n");
		System.out.println(Fachada.getInstance().procurarCliente("Pedro"));
		System.out.println(Fachada.getInstance().procurarFuncionario("Rubson"));
		System.out.println(Fachada.getInstance().procurarPrato("Torta Salgada"));
		System.out.println(Fachada.getInstance().procurarPedido("0"));
		System.out.println(Fachada.getInstance().procurarVenda("Pedro"));
		
		System.out.println("\n########  Dados excluídos  ########\n");
		System.out.println("Cliente excluído com sucesso? " + Fachada.getInstance().removerCliente("Pedro"));
		System.out.println("Funcionário excluído com sucesso? " + Fachada.getInstance().removerFuncionario("Rubson"));
		System.out.println("Prato excluído com sucesso? " + Fachada.getInstance().removerPrato("Torta Salgada"));
		System.out.println("Pedido excluído comsucesso? " + Fachada.getInstance().removerPedido("0"));
		System.out.println("Venda excluído com sucesso? " + Fachada.getInstance().removerVenda("Pedro"));
		
		
	}

}
