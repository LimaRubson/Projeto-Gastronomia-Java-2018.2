package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Cliente;
import com.rubson.gastronomia.controller.Fachada;
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

public class ProcurarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomeCliente;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido;
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcurarCliente frame = new ProcurarCliente();
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
	public ProcurarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 683, 360);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeCliente = new JLabel("Nome do Cliente:");
		nomeCliente.setBounds(10, 11, 107, 14);
		contentPane.add(nomeCliente);
		
		campoNomeCliente = new JTextField();
		campoNomeCliente.setBounds(127, 8, 366, 20);
		contentPane.add(campoNomeCliente);
		campoNomeCliente.setColumns(10);
		
		JLabel dadosDoCliente = new JLabel("Dados do Cliente");
		dadosDoCliente.setBounds(270, 75, 112, 14);
		contentPane.add(dadosDoCliente);
		
		List campoDadosCliente = new List();
		campoDadosCliente.setBounds(53, 113, 542, 199);
		contentPane.add(campoDadosCliente);
		
		JButton procurarCliente = new JButton("Procurar");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fachada.getInstance().cadastrar(cliente);
				
				if(campoNomeCliente.getText().equals(cliente.getNome())) {
					
					
					try {
						campoDadosCliente.add("Nome: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getNome());
						campoDadosCliente.add("CPF: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getCpf());
						campoDadosCliente.add("E-mail: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getEmail());
						campoDadosCliente.add("Endereço: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getEndereco());
						campoDadosCliente.add("RG: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getRg());
						campoDadosCliente.add("Sexo: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getSexo());
						campoDadosCliente.add("Telefone: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getTelefone());
						campoDadosCliente.add("Observações: " + Fachada.getInstance().procurarCliente(cliente.getNome()).getObservacoes());
					} catch (ClienteInexistenteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
			   }
			}
		});
		procurarCliente.setBounds(544, 11, 89, 23);
		contentPane.add(procurarCliente);
		
		
	}

}
