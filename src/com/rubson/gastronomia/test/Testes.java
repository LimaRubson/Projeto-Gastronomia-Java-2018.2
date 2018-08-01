package com.rubson.gastronomia.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.controller.Venda;
import com.rubson.gastronomia.util.ClienteInexistenteException;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;
import com.rubson.gastronomia.util.PedidoInexistenteException;
import com.rubson.gastronomia.util.PratoInexistenteException;
import com.rubson.gastronomia.util.VendaInexistenteException;


public class Testes {
	
	@Test
	public void testeEntidades () {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		assertNotNull(prato);
		assertNotNull(itensPedido);
		assertNotNull(itensPedido[0]);
		assertNotNull(pedido);
		assertNotNull(funcionario);
		assertNotNull(cliente);
		
	}
	
	@Test
	public void testeEntidadeCliente() throws ClienteInexistenteException {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().cadastrar(cliente);
		assertNotNull(Fachada.getInstance().procurarCliente("Pedr"));
				
		cliente.setNome("Rubs");
		assertEquals("Rubs", cliente.getNome());
		cliente.setCpf("12349897");
		assertEquals("12349897", cliente.getCpf());
		cliente.setRg("226754");
		assertEquals("226754", cliente.getRg());
		cliente.setSexo("Masculino");
		assertEquals("Masculino", cliente.getSexo());
		cliente.setEndereco("Rua Elydio Cavalcante");
		assertEquals("Rua Elydio Cavalcante", cliente.getEndereco());
		cliente.setEmail("limarubson@hotmail.com");
		assertEquals("limarubson@hotmail.com", cliente.getEmail());
		cliente.setObservacoes("Olá, sou Rubs");
		assertEquals("Olá, sou Rubs", cliente.getObservacoes());
		cliente.setTelefone("3443-0896");
		assertEquals("3443-0896", cliente.getTelefone());
		cliente.setTipoCliente("Comum");
		assertEquals("Comum", cliente.getTipoCliente());
		cliente.setPedido(pedido);
		assertEquals(pedido, cliente.getPedido());
		
		cliente.toString();
		
	}
	
	@Test
	public void testeEntidadeFuncionario() throws FuncionarioInexistenteException {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		
		Fachada.getInstance().cadastrar(funcionario);
		assertNotNull(Fachada.getInstance().procurarFuncionario("Rubson"));
		
		funcionario.setNome("Lucas");
		assertEquals("Lucas", funcionario.getNome());
		funcionario.setCpf("12308967");
		assertEquals("12308967", funcionario.getCpf());
		funcionario.setRg("6745329");
		assertEquals("6745329", funcionario.getRg());
		funcionario.setSexo("Masculino");
		assertEquals("Masculino", funcionario.getSexo());
		funcionario.setEndereco("Rua José Medeiros");
		assertEquals("Rua José Medeiros", funcionario.getEndereco());
		funcionario.setEmail("lucasferreira@hotmail.com");
		assertEquals("lucasferreira@hotmail.com", funcionario.getEmail());
		funcionario.setObservacoes("Olá, sou Lucas");
		assertEquals("Olá, sou Lucas", funcionario.getObservacoes());
		funcionario.setTipoFuncionario("Gerente");
		assertEquals("Gerente", funcionario.getTipoFuncionario());
		funcionario.setSalario(2000);
		assertNotNull(funcionario.getSalario());
		funcionario.setCargaHoraria(12);
		assertEquals(12, funcionario.getCargaHoraria());
		funcionario.setPedido(pedido);
		assertEquals(pedido, funcionario.getPedido());
		
		funcionario.toString();
	}
	
	@Test
	public void testeEntidadePedido() throws PedidoInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		
		
		pedido.setId("1");
		assertEquals("1", pedido.getId());
		pedido.setValorTotalPedidos(200);
		assertNotNull(pedido.getValorTotalPedidos());
		pedido.setItensPedido(itensPedido);
		assertNotNull(pedido.getItensPedido());
		
		pedido.toString();
		
	
	}
	
	@Test
	public void testeEntidadePrato() throws PratoInexistenteException {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		
		Fachada.getInstance().cadastrar(prato);
		assertNotNull(Fachada.getInstance().procurarPrato("Torta Salgada"));
		
		prato.setId(2);
		assertEquals(2, prato.getId());
		prato.setNome("Torta Doce");
		assertEquals("Torta Doce", prato.getNome());
		prato.setIngredientes("Manetiga, ovos, trigo e chocolate");
		assertEquals("Manetiga, ovos, trigo e chocolate", prato.getIngredientes());
		
		prato.toString();
		
		
	}
	
	@Test
	public void testeEntidadeVenda() throws VendaInexistenteException {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(venda);
		assertNotNull(Fachada.getInstance().procurarVenda("Pedro"));
		
		venda.setCliente(cliente);
		assertEquals(cliente, venda.getCliente());
		venda.setDataVenda("30/07/2018");
		assertEquals("30/07/2018", venda.getDataVenda());
		venda.setHoraVenda("15:13");
		assertEquals("15:13", venda.getHoraVenda());
		venda.setPedidoVendido(pedido);
		assertEquals(pedido, venda.getPedidoVendido());
		
		venda.toString();
		
	}
	
	@Test
	public void testeEntidadeItensPedido() {
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido itensPedido = new ItensPedido();
		
		
		itensPedido.setPrato(prato);
		assertEquals(prato, itensPedido.getPrato());
		itensPedido.setQuantidadeItensPedidos(4);
		assertEquals(4, itensPedido.getQuantidadeItensPedidos());
		itensPedido.setQuantidadePrato(10);
		assertEquals(10, itensPedido.getQuantidadePrato());
		itensPedido.setValorTotal(200);
		assertNotNull(itensPedido.getValorTotal());
		
		
		itensPedido.toString();
		
	}
	
	@Test(expected = ClienteInexistenteException.class)
	public void testeExceptionCliente() throws ClienteInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().procurarCliente("Ped");
		
	}
	
	@Test(expected = FuncionarioInexistenteException.class)
	public void testeExceptionFuncionario() throws FuncionarioInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().procurarFuncionario("Rafael");
		
	}
	
	@Test(expected = PedidoInexistenteException.class)
	public void testeExceptionPedido() throws PedidoInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().procurarPedido("1");
		
	}
	
	@Test(expected = PratoInexistenteException.class)
	public void testeExceptionPrato() throws PratoInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().procurarPrato("Torta");
		
	}
	
	@Test(expected = VendaInexistenteException.class)
	public void testeExceptionVenda() throws VendaInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().procurarVenda("Lucas");
		
	}

	@Test
	public void testeNomeExceptionCliente() {
		
		ClienteInexistenteException  clienteException = new ClienteInexistenteException("Rubson");
		
		clienteException.setNomeCliente("Rubson");
		
		assertEquals("Rubson", clienteException.getNomeCliente());
		
	}
	
	@Test
	public void testeNomeExceptionFuncionario() {
		
		FuncionarioInexistenteException  funcionarioException = new FuncionarioInexistenteException("Lucas");
		
		funcionarioException.setNomeFuncionario("Lucas");
		
		assertEquals("Lucas", funcionarioException.getNomeFuncionario());
		
	}
	
	@Test
	public void testeIdExceptionPedido() {
		
		PedidoInexistenteException  pedidoException = new PedidoInexistenteException("5");
		
		pedidoException.setIdPedido("5");
		
		assertEquals("5", pedidoException.getIdPedido());
		
	}
	
	@Test
	public void testeNomeExceptionPrato() {
		
		PratoInexistenteException  pratoException = new PratoInexistenteException("Torta Doce");
		
		pratoException.setNomePrato("Torta Doce");
		
		assertEquals("Torta Doce", pratoException.getNomePrato());
		
	}
	
	@Test
	public void testeNomeExceptionVenda() {
		
		VendaInexistenteException  vendaException = new VendaInexistenteException("Lucas");
		
		vendaException.setNomeCliente("Lucas");
		
		assertEquals("Lucas", vendaException.getNomeCliente());
		
	}
	
	@Test
	public void testeMetodosRepositorioClientes() throws ClienteInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(cliente);
		String nome = Fachada.getInstance().procurarCliente("Pedro").getNome();
		
		assertEquals("Pedro", nome);
		
		Cliente clienteAtualizado = new Cliente("Pedro", "108944764999", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		
		Fachada.getInstance().atualizar(clienteAtualizado);
		String cpfAtualizado = Fachada.getInstance().procurarCliente("Pedro").getCpf();
		
		assertEquals("108944764999", cpfAtualizado);
		
		
	}
	
	@Test
	public void testMetodosRepositorioFuncionarios() throws FuncionarioInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(funcionario);
		String nome = Fachada.getInstance().procurarFuncionario("Rubson").getNome();
		
		assertEquals("Rubson", nome);
		
		Funcionario funcionarioAtualizado = new Funcionario("Rubson", "10895576475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		
		Fachada.getInstance().atualizar(funcionarioAtualizado);
		String cpfAtualizado = Fachada.getInstance().procurarFuncionario("Rubson").getCpf();
		
		assertEquals("10895576475", cpfAtualizado);
		
	}
	
	@Test
	public void testMetodosRepositorioPratos() throws PratoInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(prato);
		String nome = Fachada.getInstance().procurarPrato("Torta Salgada").getNome();
		
		assertEquals("Torta Salgada", nome);
		
		Prato pratoAtualizado = new Prato(2, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		
		Fachada.getInstance().atualizar(pratoAtualizado);
		int idPratoAtualizado = Fachada.getInstance().procurarPrato("Torta Salgada").getId();
		
		assertEquals(2, idPratoAtualizado);
		
	}
	
	@Test
	public void testMetodosRepositorioPedidos() throws PedidoInexistenteException{
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(pedido);
		String nome = Fachada.getInstance().procurarPedido("0").getId();
		
		assertEquals("0", nome);
		
		Pedido pedidoAtualizado = new Pedido("0", 10, itensPedido);
		
		Fachada.getInstance().atualizar(pedidoAtualizado);
		String idPedidoAtualizado = Fachada.getInstance().procurarPedido("0").getId();
		
		assertEquals("0", idPedidoAtualizado);
		
	}
	
	@Test
	public void testMetodosRepositorioVendas() throws VendaInexistenteException {
		
		Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
		ItensPedido[] itensPedido = new ItensPedido[5];
		itensPedido[0] = new ItensPedido(2, prato, 100, 2);
		Pedido pedido = new Pedido("0", 100, itensPedido);
		Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
		Cliente cliente = new Cliente("Pedro", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
		Venda venda = new Venda(cliente, "27/06/2018", "15:20", pedido);
		
		Fachada.getInstance().cadastrar(venda);
		String nome = Fachada.getInstance().procurarVenda("Pedro").getCliente().getNome();
		
		assertEquals("Pedro", nome);
		
		Venda vendaAtualizado = new Venda(cliente, "27/07/2018", "15:20", pedido);
		
		Fachada.getInstance().atualizar(vendaAtualizado);
		String nomeVendaAtualizado = Fachada.getInstance().procurarVenda("Pedro").getCliente().getNome();
		
		assertEquals("Pedro", nomeVendaAtualizado);
		
	}

}
