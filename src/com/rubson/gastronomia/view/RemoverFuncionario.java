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
import com.rubson.gastronomia.util.FuncionarioInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverFuncionario extends JFrame {
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");
	ItensPedido[] itensPedido = new ItensPedido[5];
	Pedido pedido = new Pedido("0", 100, itensPedido);
	Funcionario funcionario = new Funcionario("Rubs", "10894476475", "50476475", "Masculino", "Rua Elydio Cavalcante Macedo", "limarubson@hotmail.com", "3443-0896", "Ola", 6, 1200, pedido, "gerente");
	

	private JPanel contentPane;
	private JTextField campoNomeProcurarFuncionario;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverFuncionario frame = new RemoverFuncionario();
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
	public RemoverFuncionario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 681, 373);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeProcurarFuncionrio = new JLabel("Nome do Funcion\u00E1rio:");
		nomeProcurarFuncionrio.setBounds(10, 11, 125, 14);
		contentPane.add(nomeProcurarFuncionrio);
		
		campoNomeProcurarFuncionario = new JTextField();
		campoNomeProcurarFuncionario.setBounds(145, 8, 373, 20);
		contentPane.add(campoNomeProcurarFuncionario);
		campoNomeProcurarFuncionario.setColumns(10);
		
		List campoDadosFuncionario = new List();
		campoDadosFuncionario.setBounds(97, 72, 459, 162);
		contentPane.add(campoDadosFuncionario);
		
		JButton procurarFuncionario = new JButton("Procurar");
		procurarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fachada.getInstance().cadastrar(funcionario);
				
				if(campoNomeProcurarFuncionario.getText().equals(funcionario.getNome())) {
					
					try {
						campoDadosFuncionario.add("Nome: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getNome());
						campoDadosFuncionario.add("CPF: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getCpf());
						campoDadosFuncionario.add("E-mail: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEmail());
						campoDadosFuncionario.add("Endereço: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getEndereco());
						campoDadosFuncionario.add("RG: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getRg());
						campoDadosFuncionario.add("Sexo: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getSexo());
						campoDadosFuncionario.add("Telefone: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTelefone());
						campoDadosFuncionario.add("Cargo: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getTipoFuncionario());
						campoDadosFuncionario.add("Carga horária: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getCargaHoraria());
						campoDadosFuncionario.add("Salário: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getSalario());
						campoDadosFuncionario.add("Observações: " + Fachada.getInstance().procurarFuncionario(funcionario.getNome()).getObservacoes());
					} catch (FuncionarioInexistenteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
				}
				
			}
		});
		procurarFuncionario.setBounds(553, 7, 89, 23);
		contentPane.add(procurarFuncionario);
		
		
		
		JLabel dadosFuncionrio = new JLabel("Dados do Funcion\u00E1rio");
		dadosFuncionrio.setBounds(278, 52, 166, 14);
		contentPane.add(dadosFuncionrio);
		
		JButton btnRemover = new JButton("Remover");
		btnRemover.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(campoNomeProcurarFuncionario.getText().equals(funcionario.getNome())) {
					
					Fachada.getInstance().removerFuncionario(funcionario.getNome());
					
				}
				
				
			}
		});
		btnRemover.setBounds(278, 262, 89, 23);
		contentPane.add(btnRemover);
	}

}
