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
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campoProcurarCliente;
	private JTextField campoCpfCliente;
	private JTextField campoRgCliente;
	private JTextField campoSexoCliente;
	private JTextField campoEnderecoCliente;
	private JTextField campoEmailCliente;
	private JTextField campoTelefoneCliente;
	private JTextField campoTipoCliente;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido;
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
	private JTextField campoNomeCliente;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarCliente frame = new AtualizarCliente();
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
	public AtualizarCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 690, 415);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeProcurarCliente = new JLabel("Nome:");
		nomeProcurarCliente.setBounds(10, 11, 46, 14);
		contentPane.add(nomeProcurarCliente);
		
		campoProcurarCliente = new JTextField();
		campoProcurarCliente.setBounds(66, 8, 419, 20);
		contentPane.add(campoProcurarCliente);
		campoProcurarCliente.setColumns(10);
		
		TextArea areaTextoObservacoesCliente = new TextArea();
		areaTextoObservacoesCliente.setBounds(328, 196, 310, 114);
		contentPane.add(areaTextoObservacoesCliente);
		
		
		JButton procurarCliente = new JButton("Procurar");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nomeCliente;
				String cpfCliente;
				String rgCliente;
				String sexoCliente;
				String enderecoCliente;
				String emailCliente;
				String telefoneCliente;
				String tipoCliente;
				String observacoesCliente;
				
				Fachada.getInstance().cadastrar(cliente);
				
				
				
				try {
					  if(campoProcurarCliente.getText().equals(cliente.getNome())) {
						
						
						nomeCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getNome();
						cpfCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getCpf();
						rgCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getRg();
						sexoCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getSexo();
						enderecoCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getEndereco();
						emailCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getEmail();
						telefoneCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getTelefone();
						tipoCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getTipoCliente();
						observacoesCliente = Fachada.getInstance().procurarCliente(cliente.getNome()).getObservacoes();
						
						
						campoNomeCliente.setText(nomeCliente);
						campoCpfCliente.setText(cpfCliente);
						campoRgCliente.setText(rgCliente);
						campoSexoCliente.setText(sexoCliente);
						campoEnderecoCliente.setText(enderecoCliente);
						campoEmailCliente.setText(emailCliente);
						campoTelefoneCliente.setText(telefoneCliente);
						campoTipoCliente.setText(tipoCliente);
						areaTextoObservacoesCliente.setText(observacoesCliente);
						
						
					}
					
				} catch (ClienteInexistenteException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		procurarCliente.setBounds(517, 7, 89, 23);
		contentPane.add(procurarCliente);
		
		JLabel cpfCliente = new JLabel("CPF:");
		cpfCliente.setBounds(10, 145, 46, 14);
		contentPane.add(cpfCliente);
		
		campoCpfCliente = new JTextField();
		campoCpfCliente.setBounds(89, 142, 156, 20);
		contentPane.add(campoCpfCliente);
		campoCpfCliente.setColumns(10);
		
		JLabel rgCliente = new JLabel("RG:");
		rgCliente.setBounds(267, 114, 46, 14);
		contentPane.add(rgCliente);
		
		campoRgCliente = new JTextField();
		campoRgCliente.setBounds(336, 108, 149, 20);
		contentPane.add(campoRgCliente);
		campoRgCliente.setColumns(10);
		
		JLabel sexoCliente = new JLabel("Sexo:");
		sexoCliente.setBounds(508, 111, 46, 14);
		contentPane.add(sexoCliente);
		
		campoSexoCliente = new JTextField();
		campoSexoCliente.setBounds(564, 111, 86, 20);
		contentPane.add(campoSexoCliente);
		campoSexoCliente.setColumns(10);
		
		JLabel enderecoCliente = new JLabel("Endereco:");
		enderecoCliente.setBounds(10, 185, 63, 14);
		contentPane.add(enderecoCliente);
		
		campoEnderecoCliente = new JTextField();
		campoEnderecoCliente.setBounds(109, 182, 202, 20);
		contentPane.add(campoEnderecoCliente);
		campoEnderecoCliente.setColumns(10);
		
		JLabel emailCliente = new JLabel("E-mail:");
		emailCliente.setBounds(317, 145, 46, 14);
		contentPane.add(emailCliente);
		
		campoEmailCliente = new JTextField();
		campoEmailCliente.setBounds(387, 142, 167, 20);
		contentPane.add(campoEmailCliente);
		campoEmailCliente.setColumns(10);
		
		JLabel telefoneCliente = new JLabel("Telefone:");
		telefoneCliente.setBounds(10, 216, 63, 14);
		contentPane.add(telefoneCliente);
		
		campoTelefoneCliente = new JTextField();
		campoTelefoneCliente.setBounds(109, 213, 161, 20);
		contentPane.add(campoTelefoneCliente);
		campoTelefoneCliente.setColumns(10);
		
		JLabel observacoesCliente = new JLabel("Observa\u00E7\u00F5es:");
		observacoesCliente.setBounds(435, 176, 89, 14);
		contentPane.add(observacoesCliente);
		
		JLabel tipoCliente = new JLabel("Tipo cliente:");
		tipoCliente.setBounds(10, 246, 77, 17);
		contentPane.add(tipoCliente);
		
		campoTipoCliente = new JTextField();
		campoTipoCliente.setBounds(108, 244, 104, 20);
		contentPane.add(campoTipoCliente);
		campoTipoCliente.setColumns(10);
		
		JButton btnAtualizar = new JButton("Atualizar");
		btnAtualizar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String nome = campoNomeCliente.getText();
				String cpf = campoCpfCliente.getText();
				String rg = campoRgCliente.getText();
				String sexo = campoSexoCliente.getText();
				String endereco = campoEnderecoCliente.getText();
				String email = campoEmailCliente.getText();
				String telefone = campoTelefoneCliente.getText();
				String tipo = campoTipoCliente.getText();
				String observacoes = areaTextoObservacoesCliente.getText();
				
				cliente.setNome(nome);
				cliente.setCpf(cpf);
				cliente.setRg(rg);
				cliente.setSexo(sexo);
				cliente.setEndereco(endereco);
				cliente.setEmail(email);
				cliente.setTelefone(telefone);
				cliente.setTipoCliente(tipo);
				cliente.setObservacoes(observacoes);
				
				
				Fachada.getInstance().atualizar(cliente);
				
				
			}
		});
		btnAtualizar.setBounds(270, 343, 109, 23);
		contentPane.add(btnAtualizar);
		
		JLabel dadosParaAtualizar = new JLabel("Dados para atualizar");
		dadosParaAtualizar.setBounds(277, 66, 127, 14);
		contentPane.add(dadosParaAtualizar);
		
		JLabel nomeCliente = new JLabel("Nome:");
		nomeCliente.setBounds(10, 114, 46, 14);
		contentPane.add(nomeCliente);
		
		campoNomeCliente = new JTextField();
		campoNomeCliente.setBounds(89, 111, 156, 20);
		contentPane.add(campoNomeCliente);
		campoNomeCliente.setColumns(10);
	}
}
