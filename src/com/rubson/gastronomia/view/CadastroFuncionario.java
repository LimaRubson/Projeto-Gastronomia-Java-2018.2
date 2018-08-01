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

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpf;
	private JTextField campoRg;
	private JTextField campoSexo;
	private JTextField campoEndereco;
	private JTextField campoEmail;
	private JTextField campoTelefone;
	private JTextField campoTipoFuncionario;
	private JTextField campoCargaHoraria;
	private JTextField campoSalario;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido;
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Funcionario funcionario = new Funcionario("Rubson", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroFuncionario frame = new CadastroFuncionario();
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
	public CadastroFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 598, 391);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 23, 46, 14);
		contentPane.add(nome);
		
		campoNome = new JTextField();
		campoNome.setBounds(66, 20, 390, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(10, 59, 46, 14);
		contentPane.add(cpf);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(66, 56, 145, 20);
		contentPane.add(campoCpf);
		campoCpf.setColumns(10);
		
		JLabel rg = new JLabel("RG:");
		rg.setBounds(236, 59, 46, 14);
		contentPane.add(rg);
		
		campoRg = new JTextField();
		campoRg.setBounds(292, 56, 116, 20);
		contentPane.add(campoRg);
		campoRg.setColumns(10);
		
		JLabel sexo = new JLabel("Sexo");
		sexo.setBounds(431, 59, 46, 14);
		contentPane.add(sexo);
		
		campoSexo = new JTextField();
		campoSexo.setBounds(471, 56, 86, 20);
		contentPane.add(campoSexo);
		campoSexo.setColumns(10);
		
		JLabel lblEndereo = new JLabel("Endere\u00E7o:");
		lblEndereo.setBounds(10, 94, 67, 14);
		contentPane.add(lblEndereo);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(76, 91, 166, 20);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JLabel email = new JLabel("E-mail:");
		email.setBounds(282, 94, 46, 14);
		contentPane.add(email);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(349, 91, 188, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel telefone = new JLabel("Telefone:");
		telefone.setBounds(10, 135, 67, 14);
		contentPane.add(telefone);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(86, 132, 156, 20);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JLabel observacoes = new JLabel("Observa\u00E7\u00F5es");
		observacoes.setBounds(419, 122, 86, 14);
		contentPane.add(observacoes);
		
		TextArea areaTextoObservacoes = new TextArea();
		areaTextoObservacoes.setBounds(335, 144, 237, 135);
		contentPane.add(areaTextoObservacoes);
		
		JLabel tipoFuncionario = new JLabel("Tipo funcion\u00E1rio");
		tipoFuncionario.setBounds(10, 174, 97, 14);
		contentPane.add(tipoFuncionario);
		
		campoTipoFuncionario = new JTextField();
		campoTipoFuncionario.setBounds(125, 171, 117, 20);
		contentPane.add(campoTipoFuncionario);
		campoTipoFuncionario.setColumns(10);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				funcionario.setNome(campoNome.getText());
				funcionario.setCpf(campoCpf.getText());
				funcionario.setRg(campoRg.getText());
				funcionario.setSexo(campoSexo.getText());
				funcionario.setEndereco(campoEndereco.getText());
				funcionario.setEmail(campoEmail.getText());
				funcionario.setTelefone(campoTelefone.getText());
				funcionario.setTipoFuncionario(campoTipoFuncionario.getText());
				funcionario.setCargaHoraria(Integer.parseInt(campoCargaHoraria.getText()));
				funcionario.setSalario(Double.parseDouble(campoSalario.getText()));
				
				Fachada.getInstance().cadastrar(funcionario);
				
			}
		});
		btnAdicionar.setBounds(226, 319, 89, 23);
		contentPane.add(btnAdicionar);
		
		JLabel cargaHoraria = new JLabel("Carga hor\u00E1ria");
		cargaHoraria.setBounds(10, 204, 79, 14);
		contentPane.add(cargaHoraria);
		
		campoCargaHoraria = new JTextField();
		campoCargaHoraria.setBounds(125, 201, 117, 20);
		contentPane.add(campoCargaHoraria);
		campoCargaHoraria.setColumns(10);
		
		JLabel salario = new JLabel("Sal\u00E1rio:");
		salario.setBounds(10, 240, 67, 14);
		contentPane.add(salario);
		
		campoSalario = new JTextField();
		campoSalario.setBounds(102, 237, 86, 20);
		contentPane.add(campoSalario);
		campoSalario.setColumns(10);
	}

}
