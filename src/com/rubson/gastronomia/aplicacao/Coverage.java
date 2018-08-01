package com.rubson.gastronomia.aplicacao;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Pessoa;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.controller.Venda;
import com.rubson.gastronomia.model.RepositorioClientes;
import com.rubson.gastronomia.model.RepositorioClientesArray;
import com.rubson.gastronomia.test.Testes;
import com.rubson.gastronomia.util.ClienteInexistenteException;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;
import com.rubson.gastronomia.util.PedidoInexistenteException;
import com.rubson.gastronomia.util.PratoInexistenteException;
import com.rubson.gastronomia.util.VendaInexistenteException;

public class Coverage {
	
	public Coverage() {
		
	}

	public static void main(String[] args) {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Cliente cliente1 = new Cliente("Ped", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Cliente cliente2 = new Cliente("Peo", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		RepositorioClientes clientes = new RepositorioClientesArray();
		clientes.inserir(cliente);
		clientes.inserir(cliente1);
		clientes.inserir(cliente2);
		
		System.out.println(cliente);
		
		Fachada.getInstance().cadastrar(cliente);
		Fachada.getInstance().cadastrar(funcionario);
		Fachada.getInstance().cadastrar(prato);
		Fachada.getInstance().cadastrar(pedido);
		Fachada.getInstance().cadastrar(venda);
		
		System.out.println("\n########  Dados Cadastrados  ########\n");
		
		try {//Sucesso
			
			System.out.println(Fachada.getInstance().procurarCliente("Pedr").toString());
			
		} catch (ClienteInexistenteException e1) {
		
			e1.printStackTrace();
			
		}
		
		ClienteInexistenteException clienteException = new ClienteInexistenteException("Pedr");
		clienteException.setNomeCliente("Pedr");
		clienteException.getNomeCliente();
		
		try {//Exceção
			System.out.println(Fachada.getInstance().procurarCliente("Lucas"));
		} catch (ClienteInexistenteException e2) {
			e2.printStackTrace();
		}
			
		try {
			System.out.println(Fachada.getInstance().procurarFuncionario("Rubson").toString());
		} catch (FuncionarioInexistenteException e1) {
			e1.printStackTrace();
		}
		
		FuncionarioInexistenteException funcionarioException = new FuncionarioInexistenteException("Rubson");
		funcionarioException.setNomeFuncionario("Rubson");
		funcionarioException.getNomeFuncionario();
		
		try {
			System.out.println(Fachada.getInstance().procurarFuncionario("Rubs"));
		} catch (FuncionarioInexistenteException e2) {
			e2.printStackTrace();
		}
		
		try {
			System.out.println(Fachada.getInstance().procurarPrato("Torta Salgada").toString());
		} catch (PratoInexistenteException e1) {
			e1.printStackTrace();
		}
		
		PratoInexistenteException pratoException = new PratoInexistenteException("Torta Salgada");
		pratoException.setNomePrato("Torta Salgada");
		pratoException.getNomePrato();
		
		try {
			System.out.println(Fachada.getInstance().procurarPrato("Torta Salg").toString());
		} catch (PratoInexistenteException e2) {
			e2.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarPedido("0").toString());
		} catch (PedidoInexistenteException e1) {
			e1.printStackTrace();
		}
		PedidoInexistenteException pedidoException = new PedidoInexistenteException("0");
		pedidoException.setIdPedido("0");
		pedidoException.getIdPedido();
		try {
			System.out.println(Fachada.getInstance().procurarPedido("1").toString());
		} catch (PedidoInexistenteException e2) {
			e2.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarVenda("Pedr").toString());
		} catch (VendaInexistenteException e1) {
			e1.printStackTrace();
		}
		VendaInexistenteException vendaException = new VendaInexistenteException("Pedr");
		vendaException.setNomeCliente("Pedr");
		vendaException.getNomeCliente();
		try {
			System.out.println(Fachada.getInstance().procurarVenda("Lucas").toString());
		} catch (VendaInexistenteException e2) {
			e2.printStackTrace();
		}
		
		Prato pratoAtualizado = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedidoAtualizado = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(3, pratoAtualizado, 100, 4);
		Pedido pedidoAtualizado = new Pedido("0", 20, itensPedidoAtualizado);
		Funcionario funcionarioAtualizado = new Funcionario("Rubson", "10894476479", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0876", "Ola", 6, 1200, pedidoAtualizado, "Garcom");
		Cliente clienteAtualizado = new Cliente("Pedr", "10894476473", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@gmail.com", "3443-7734", "Oi", "VIP", pedidoAtualizado);
		Venda vendaAtualizado = new Venda(cliente, "02/06/2018", "09:40", pedidoAtualizado);
		
		//Atualização dos dados
		Fachada.getInstance().atualizar(clienteAtualizado);
		Fachada.getInstance().atualizar(funcionarioAtualizado);
		Fachada.getInstance().atualizar(pratoAtualizado);
		Fachada.getInstance().atualizar(pedidoAtualizado);
		Fachada.getInstance().atualizar(vendaAtualizado);
		
		System.out.println("\n########  Dados Atualizados  ########\n");
		try {
			System.out.println(Fachada.getInstance().procurarCliente("Pedr").toString());
		} catch (ClienteInexistenteException e) {
	
			e.printStackTrace();
			
		}
		try {
			System.out.println(Fachada.getInstance().procurarCliente("Lucas").toString());
		} catch (ClienteInexistenteException e) {
	
			e.printStackTrace();
			
		}
		try {
			System.out.println(Fachada.getInstance().procurarFuncionario("Rubson").toString());
		} catch (FuncionarioInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarFuncionario("Rubs").toString());
		} catch (FuncionarioInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarPrato("Torta Salgada").toString());
		} catch (PratoInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarPrato("Torta Salg").toString());
		} catch (PratoInexistenteException e) {
			e.printStackTrace();
		}

		try {
			System.out.println(Fachada.getInstance().procurarPedido("0").toString());
		} catch (PedidoInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarPedido("1").toString());
		} catch (PedidoInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarVenda("Pedr").toString());
		} catch (VendaInexistenteException e) {
			e.printStackTrace();
		}
		try {
			System.out.println(Fachada.getInstance().procurarVenda("Lucas").toString());
		} catch (VendaInexistenteException e) {
			e.printStackTrace();
		}
		
		//Dados excluídos
		Fachada.getInstance().removerCliente("Pedr");
		Fachada.getInstance().removerFuncionario("Rubson");
		Fachada.getInstance().removerPrato("Torta Salgada");
		Fachada.getInstance().removerPedido("0");
		Fachada.getInstance().removerVenda("Pedr");
		
		
		//Coverage Cliente
		Prato pratoCoverage = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedidoCoverage = new ItensPedido[5];
		itensPedidoCoverage[0] = new ItensPedido(2, prato, 100, 2);
		itensPedidoCoverage[1] = new ItensPedido();
		Pedido pedidoCoverage = new Pedido("0", 100, itensPedido);
		Funcionario funcionarioCoverage = new Funcionario("Rubson", "10894476479", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0876", "Ola", 6, 1200, pedidoAtualizado, "Garcom");
		Cliente clienteCoverage = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda vendaCoverage = new Venda(cliente, "27/06/2018", "15:20", pedido);

		
		clienteCoverage.setPedido(pedidoCoverage);
		clienteCoverage.getPedido();
		
		clienteCoverage.setTipoCliente("VIP");
		clienteCoverage.getTipoCliente();
		
		clienteCoverage.setNome("Rubson");
		clienteCoverage.getNome();
		
		clienteCoverage.setCpf("123456");
		clienteCoverage.getCpf();
		
		clienteCoverage.setRg("19742");
		clienteCoverage.getRg();
		
		clienteCoverage.setSexo("Masculino");
		clienteCoverage.getSexo();
		
		clienteCoverage.setEndereco("Elydio Cavalcante");
		clienteCoverage.getEndereco();
		
		clienteCoverage.setEmail("limarubson7@gmail.com");
		clienteCoverage.getEmail();
		
		clienteCoverage.setTelefone("3443-0896");
		clienteCoverage.getTelefone();
		
		clienteCoverage.setObservacoes("Olá");
		clienteCoverage.getObservacoes();
		
		
		funcionarioCoverage.setCargaHoraria(6);
		funcionarioCoverage.getCargaHoraria();
		
		funcionarioCoverage.setSalario(1000);
		funcionarioCoverage.getSalario();
		
		funcionarioCoverage.setPedido(pedidoCoverage);
		funcionarioCoverage.getPedido();
		
		funcionarioCoverage.setTipoFuncionario("garçom");
		funcionarioCoverage.getTipoFuncionario();
		
		funcionarioCoverage.setNome("Rafael");
		funcionarioCoverage.getNome();
		
		funcionarioCoverage.setCpf("9993457");
		funcionarioCoverage.getCpf();
		
		funcionarioCoverage.setRg("123475");
		funcionarioCoverage.getRg();
		
		funcionarioCoverage.setSexo("Masculino");
		funcionarioCoverage.getSexo();
		
		funcionarioCoverage.setEndereco("Elydio Cavalcante Macedo");
		funcionarioCoverage.getEndereco();
		
		funcionarioCoverage.setEmail("rafaelima@hotmail.com");
		funcionarioCoverage.getEmail();
		
		funcionarioCoverage.setTelefone("3454-6698");
		funcionarioCoverage.getTelefone();
		
		funcionarioCoverage.setObservacoes("Olá, pessoas");
		funcionarioCoverage.getObservacoes();
		
		
		itensPedidoCoverage[1].setQuantidadeItensPedidos(5);
		itensPedidoCoverage[1].getQuantidadeItensPedidos();
		
		itensPedidoCoverage[1].setPrato(pratoCoverage);
		itensPedidoCoverage[1].getPrato();
		
		itensPedidoCoverage[1].setValorTotal(100);
		itensPedidoCoverage[1].getValorTotal();
		
		itensPedidoCoverage[1].setQuantidadePrato(2);
		itensPedidoCoverage[1].getQuantidadePrato();
		
		pedidoCoverage.setValorTotalPedidos(100);
		pedidoCoverage.getValorTotalPedidos();
		
		pedidoCoverage.setId("3");
		pedidoCoverage.getId();
		
		pedidoCoverage.setItensPedido(itensPedidoCoverage);
		pedidoCoverage.getItensPedido();
		
		
		pratoCoverage.setId(5);
		pratoCoverage.getId();
		
		pratoCoverage.setNome("Torta Doce");
		pratoCoverage.getNome();
		
		pratoCoverage.setIngredientes("Trigo, Manteiga, Açuca, Ovos e Chocolate");
		pratoCoverage.getIngredientes();
		
		
		vendaCoverage.setDataVenda("23/07/2018");
		vendaCoverage.getDataVenda();
		
		vendaCoverage.setHoraVenda("16:00");
		vendaCoverage.getHoraVenda();
		
		vendaCoverage.setPedidoVendido(pedidoCoverage);
		vendaCoverage.getPedidoVendido();
		
		vendaCoverage.setCliente(clienteCoverage);
		vendaCoverage.getCliente();
		
		
		Coverage coverage = new Coverage();
		
		Programa programa = new Programa();
		
	
	} 


}
