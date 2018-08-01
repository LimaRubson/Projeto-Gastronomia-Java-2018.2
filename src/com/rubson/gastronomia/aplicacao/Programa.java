package com.rubson.gastronomia.aplicacao;
import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.controller.Venda;
import com.rubson.gastronomia.model.RepositorioClientes;
import com.rubson.gastronomia.model.RepositorioClientesArray;
import com.rubson.gastronomia.util.ClienteInexistenteException;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;
import com.rubson.gastronomia.util.PedidoInexistenteException;
import com.rubson.gastronomia.util.PratoInexistenteException;
import com.rubson.gastronomia.util.VendaInexistenteException;

public class Programa {
	
	public Programa() {
		
	}

	public static void main(String[] args) throws ClienteInexistenteException {
		
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
		
	}
}
