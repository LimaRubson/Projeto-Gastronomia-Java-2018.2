package com.rubson.gastronomia.aplicacao;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.controller.Venda;

public class Programa {

	public static void main(String[] args) {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[1];
		itensPedido[0] = new ItensPedido(2, prato, 50, 4);
		Pedido pedido = new Pedido(10, itensPedido[0]);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, null, "gerente");
		Cliente cliente = new Cliente("João", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi");
		Venda venda = new Venda(cliente, "28/4/2018", 16, pedido);

		System.out.println(prato.toString());
		System.out.println(itensPedido[0].toString());
		System.out.println(pedido.toString());
		System.out.println(funcionario.toString());
		System.out.println(venda.toString());
		
	}

}
