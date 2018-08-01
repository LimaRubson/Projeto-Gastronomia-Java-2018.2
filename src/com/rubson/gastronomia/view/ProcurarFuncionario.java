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
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcurarFuncionario extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomeFuncionario;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido = new ItensPedido[5];
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Funcionario funcionario = new Funcionario("Rubs", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcurarFuncionario frame = new ProcurarFuncionario();
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
	public ProcurarFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 680, 317);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeFuncionario = new JLabel("Nome do funcion\u00E1rio:");
		nomeFuncionario.setBounds(10, 11, 121, 14);
		contentPane.add(nomeFuncionario);
		
		campoNomeFuncionario = new JTextField();
		campoNomeFuncionario.setBounds(154, 8, 326, 20);
		contentPane.add(campoNomeFuncionario);
		campoNomeFuncionario.setColumns(10);
		
		List campodadosFuncionario = new List();
		campodadosFuncionario.setBounds(85, 83, 490, 186);
		contentPane.add(campodadosFuncionario);
		
		JButton procurarFuncionario = new JButton("Procurar");
		procurarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fachada.getInstance().cadastrar(funcionario);
				
				if(campoNomeFuncionario.getText().equals(funcionario.getNome())) {
					
					try {
						campodadosFuncionario.add("Nome: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getNome());
						campodadosFuncionario.add("CPF: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getCpf());
						campodadosFuncionario.add("E-mail: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEmail());
						campodadosFuncionario.add("Endereço: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEndereco());
						campodadosFuncionario.add("RG: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getRg());
						campodadosFuncionario.add("Sexo: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getSexo());
						campodadosFuncionario.add("Telefone: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTelefone());
						campodadosFuncionario.add("Cargo: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTipoFuncionario());
						campodadosFuncionario.add("Carga horária: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getCargaHoraria());
						campodadosFuncionario.add("Salário: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getSalario());
						campodadosFuncionario.add("Observações: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getObservacoes());
					} catch (FuncionarioInexistenteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		procurarFuncionario.setBounds(521, 11, 121, 23);
		contentPane.add(procurarFuncionario);
		
		
		
		JLabel dadosFuncionrio = new JLabel("Dados do funcion\u00E1rio");
		dadosFuncionrio.setBounds(285, 63, 154, 14);
		contentPane.add(dadosFuncionrio);
	}
}
