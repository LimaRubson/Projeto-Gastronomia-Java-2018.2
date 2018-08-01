package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.util.ClienteInexistenteException;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverCliente extends JFrame {
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido = new ItensPedido[5];
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
	

	private JPanel contentPane;
	private JTextField campoNomeProcurarCliente;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverCliente frame = new RemoverCliente();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public RemoverCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 624, 319);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeDoCliente = new JLabel("Nome do Cliente:");
		nomeDoCliente.setBounds(10, 11, 96, 14);
		contentPane.add(nomeDoCliente);
		
		campoNomeProcurarCliente = new JTextField();
		campoNomeProcurarCliente.setBounds(128, 8, 318, 20);
		contentPane.add(campoNomeProcurarCliente);
		campoNomeProcurarCliente.setColumns(10);
		
		List campoDadosCliente = new List();
		campoDadosCliente.setBounds(83, 71, 408, 146);
		contentPane.add(campoDadosCliente);
		
		JButton procurarCliente = new JButton("Procurar");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada.getInstance().cadastrar(cliente);
				
				if(campoNomeProcurarCliente.getText().equals(cliente.getNome())) {
					
					try {
						campoDadosCliente.add("Nome: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getNome());
						campoDadosCliente.add("CPF: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getCpf());
						campoDadosCliente.add("E-mail: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getEmail());
						campoDadosCliente.add("Endereço: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getEndereco());
						campoDadosCliente.add("RG: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getRg());
						campoDadosCliente.add("Sexo: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getSexo());
						campoDadosCliente.add("Telefone: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getTelefone());
						campoDadosCliente.add("Cargo: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getTipoCliente());
						campoDadosCliente.add("Observações: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getObservacoes());
					
					} catch (ClienteInexistenteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				
			}
		});
		procurarCliente.setBounds(491, 7, 89, 23);
		contentPane.add(procurarCliente);
		
		JLabel dadosDoCliente = new JLabel("Dados do Cliente");
		dadosDoCliente.setBounds(241, 51, 113, 14);
		contentPane.add(dadosDoCliente);
		
		
		
		JButton removerCliente = new JButton("Remover");
		removerCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(campoNomeProcurarCliente.getText().equals(cliente.getNome())) {
					
					Fachada.getInstance().removerFuncionario(cliente.getNome());
					
				}
				
			}
		});
		removerCliente.setBounds(253, 247, 89, 23);
		contentPane.add(removerCliente);
	}
}
