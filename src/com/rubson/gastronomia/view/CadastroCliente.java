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
import com.rubson.gastronomia.controller.Venda;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroCliente extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpf;
	private JTextField campoRg;
	private JTextField campoSexo;
	private JTextField campoEndereco;
	private JTextField campoEmail;
	private JTextField campoTelefone;
	private JTextField campoTipoCliente;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido;
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
	Cliente cliente = new Cliente("Pedr", "10894476477", "50476478", "Masculino", "Rua Macial Pinheiro", "joaoalberto@hotmail.com", "3443-7724", "Oi", "VIP", pedido);
	
	
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroCliente frame = new CadastroCliente();
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
	public CadastroCliente() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 505, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 22, 46, 14);
		contentPane.add(nome);
		
		campoNome = new JTextField();
		campoNome.setBounds(54, 19, 356, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(10, 57, 46, 14);
		contentPane.add(cpf);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(54, 54, 122, 20);
		contentPane.add(campoCpf);
		campoCpf.setColumns(10);
		
		JLabel rg = new JLabel("RG:");
		rg.setBounds(186, 57, 46, 14);
		contentPane.add(rg);
		
		campoRg = new JTextField();
		campoRg.setBounds(235, 54, 86, 20);
		contentPane.add(campoRg);
		campoRg.setColumns(10);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setBounds(342, 57, 36, 14);
		contentPane.add(sexo);
		
		campoSexo = new JTextField();
		campoSexo.setBounds(388, 54, 62, 20);
		contentPane.add(campoSexo);
		campoSexo.setColumns(10);
		
		JLabel endereco = new JLabel("Endere\u00E7o:");
		endereco.setBounds(10, 92, 71, 14);
		contentPane.add(endereco);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(80, 89, 141, 20);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JLabel email = new JLabel("E-mail:");
		email.setBounds(245, 92, 62, 14);
		contentPane.add(email);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(292, 89, 158, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel telefone = new JLabel("Telefone:");
		telefone.setBounds(10, 128, 55, 14);
		contentPane.add(telefone);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(74, 125, 131, 20);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JLabel observacoes = new JLabel("Observa\u00E7\u00F5es:");
		observacoes.setBounds(316, 128, 94, 14);
		contentPane.add(observacoes);
		
		TextArea areaTextoObservacoes = new TextArea();
		areaTextoObservacoes.setBounds(256, 148, 194, 114);
		contentPane.add(areaTextoObservacoes);
		
		JLabel tipoCliente = new JLabel("Tipo Cliente:");
		tipoCliente.setBounds(10, 160, 72, 14);
		contentPane.add(tipoCliente);
		
		campoTipoCliente = new JTextField();
		campoTipoCliente.setBounds(84, 156, 92, 20);
		contentPane.add(campoTipoCliente);
		campoTipoCliente.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				cliente.setNome(campoNome.getText());
				cliente.setCpf(campoCpf.getText());
				cliente.setRg(campoRg.getText());
				cliente.setSexo(campoSexo.getText());
				cliente.setEndereco(campoEndereco.getText());
				cliente.setEmail(campoEmail.getText());
				cliente.setTelefone(campoTelefone.getText());
				cliente.setTipoCliente(campoTipoCliente.getText());
				cliente.setObservacoes(areaTextoObservacoes.getText());
				
				Fachada.getInstance().cadastrar(cliente);
				
			}
		});
		btnAdicionar.setBounds(186, 301, 89, 23);
		contentPane.add(btnAdicionar);
	}
}
