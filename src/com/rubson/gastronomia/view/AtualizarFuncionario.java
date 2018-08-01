package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Funcionario;
import com.rubson.gastronomia.controller.ItensPedido;
import com.rubson.gastronomia.controller.Pedido;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.Label;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarFuncionario extends JFrame {
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido = new ItensPedido[5];
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Funcionario funcionario = new Funcionario("Rubs", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
	
	private JPanel contentPane;
	private JTextField campoNome;
	private JTextField campoCpf;
	private JTextField campoRg;
	private JTextField campoSexo;
	private JTextField campoEndereco;
	private JTextField campoEmail;
	private JTextField campoTelefone;
	private JTextField campoTipoFuncionario;
	private JTextField campoNomeProcurarFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarFuncionario frame = new AtualizarFuncionario();
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
	public AtualizarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 660, 471);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(10, 102, 46, 14);
		contentPane.add(nome);
		
		campoNome = new JTextField();
		campoNome.setBounds(56, 99, 444, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel cpf = new JLabel("CPF:");
		cpf.setBounds(10, 133, 46, 14);
		contentPane.add(cpf);
		
		campoCpf = new JTextField();
		campoCpf.setBounds(56, 130, 167, 20);
		contentPane.add(campoCpf);
		campoCpf.setColumns(10);
		
		JLabel rg = new JLabel("RG:");
		rg.setBounds(247, 133, 46, 14);
		contentPane.add(rg);
		
		campoRg = new JTextField();
		campoRg.setBounds(289, 130, 118, 20);
		contentPane.add(campoRg);
		campoRg.setColumns(10);
		
		JLabel sexo = new JLabel("Sexo:");
		sexo.setBounds(430, 133, 46, 14);
		contentPane.add(sexo);
		
		campoSexo = new JTextField();
		campoSexo.setBounds(486, 130, 86, 20);
		contentPane.add(campoSexo);
		campoSexo.setColumns(10);
		
		JLabel endereco = new JLabel("Endere\u00E7o:");
		endereco.setBounds(10, 175, 69, 14);
		contentPane.add(endereco);
		
		campoEndereco = new JTextField();
		campoEndereco.setBounds(90, 172, 246, 20);
		contentPane.add(campoEndereco);
		campoEndereco.setColumns(10);
		
		JLabel email = new JLabel("E-mail:");
		email.setBounds(346, 175, 46, 14);
		contentPane.add(email);
		
		campoEmail = new JTextField();
		campoEmail.setBounds(402, 172, 220, 20);
		contentPane.add(campoEmail);
		campoEmail.setColumns(10);
		
		JLabel telefone = new JLabel("Telefone:");
		telefone.setBounds(10, 216, 69, 14);
		contentPane.add(telefone);
		
		campoTelefone = new JTextField();
		campoTelefone.setBounds(89, 213, 167, 20);
		contentPane.add(campoTelefone);
		campoTelefone.setColumns(10);
		
		JLabel observacoes = new JLabel("Observa\u00E7\u00F5es:");
		observacoes.setBounds(433, 216, 86, 14);
		contentPane.add(observacoes);
		
		TextArea areaTextoObservacoes = new TextArea();
		areaTextoObservacoes.setBounds(355, 236, 246, 132);
		contentPane.add(areaTextoObservacoes);
		
		JLabel tipoFuncionario = new JLabel("Tipo Funcionario");
		tipoFuncionario.setBounds(10, 262, 107, 14);
		contentPane.add(tipoFuncionario);
		
		campoTipoFuncionario = new JTextField();
		campoTipoFuncionario.setBounds(111, 259, 112, 20);
		contentPane.add(campoTipoFuncionario);
		campoTipoFuncionario.setColumns(10);
		
		JButton atualizarFuncionario = new JButton("Atualizar");
		atualizarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nome = campoNome.getText();
				String cpf = campoCpf.getText();
				String rg = campoRg.getText();
				String sexo = campoSexo.getText();
				String endereco = campoEndereco.getText();
				String email = campoEmail.getText();
				String telefone = campoTelefone.getText();
				String tipo = campoTipoFuncionario.getText();
				String observacoes = areaTextoObservacoes.getText();
				
				funcionario.setNome(nome);
				funcionario.setCpf(cpf);
				funcionario.setRg(rg);
				funcionario.setSexo(sexo);
				funcionario.setEndereco(endereco);
				funcionario.setEmail(email);
				funcionario.setTelefone(telefone);
				funcionario.setTipoFuncionario(tipo);
				funcionario.setObservacoes(observacoes);
				
				
				Fachada.getInstance().atualizar(funcionario);
				
				
			}
		});
		atualizarFuncionario.setBounds(270, 399, 107, 23);
		contentPane.add(atualizarFuncionario);
		
		JLabel dadosParaAtualizar = new JLabel("Dados para atualizar");
		dadosParaAtualizar.setBounds(270, 58, 137, 14);
		contentPane.add(dadosParaAtualizar);
		
		JLabel nomeDoFuncionarioProcurar = new JLabel("Nome do funcion\u00E1rio:");
		nomeDoFuncionarioProcurar.setBounds(10, 32, 124, 14);
		contentPane.add(nomeDoFuncionarioProcurar);
		
		campoNomeProcurarFuncionario = new JTextField();
		campoNomeProcurarFuncionario.setBounds(144, 29, 356, 20);
		contentPane.add(campoNomeProcurarFuncionario);
		campoNomeProcurarFuncionario.setColumns(10);
		
		JButton procurarFuncionario = new JButton("Procurar");
		procurarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				String nomeFuncionario;
				String cpfFuncionario;
				String rgFuncionario;
				String sexoFuncionario;
				String enderecoFuncionario;
				String emailFuncionario;
				String telefoneFuncionario;
				String tipoFuncionario;
				String observacoesFuncionario;
				
				Fachada.getInstance().cadastrar(funcionario);
				
				
				try {
					
					if(campoNomeProcurarFuncionario.getText().equals(funcionario.getNome())) {
						
						nomeFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getNome();
						cpfFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getCpf();
						rgFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getRg();
						sexoFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getSexo();
						enderecoFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEndereco();
						emailFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEmail();
						telefoneFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTelefone();
						tipoFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTipoFuncionario();
						observacoesFuncionario = Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getObservacoes();
						
						
						campoNome.setText(nomeFuncionario);
						campoCpf.setText(cpfFuncionario);
						campoRg.setText(rgFuncionario);
						campoSexo.setText(sexoFuncionario);
						campoEndereco.setText(enderecoFuncionario);
						campoEmail.setText(emailFuncionario);
						campoTelefone.setText(telefoneFuncionario);
						campoTipoFuncionario.setText(tipoFuncionario);
						areaTextoObservacoes.setText(observacoesFuncionario);
						
						
					}
					
						
				} catch (FuncionarioInexistenteException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				
				
			}
		});
		procurarFuncionario.setBounds(526, 28, 96, 23);
		contentPane.add(procurarFuncionario);
	}
}
