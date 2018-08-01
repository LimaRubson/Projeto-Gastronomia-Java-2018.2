package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Gastronomia extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Gastronomia frame = new Gastronomia();
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
	public Gastronomia() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 584, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton cadastrarFuncionario = new JButton("Cadastrar Funcion\u00E1rio");
		cadastrarFuncionario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				CadastroFuncionario cadastroFuncionario = new CadastroFuncionario();
				
				cadastroFuncionario.setVisible(true);
			}
		});
		cadastrarFuncionario.setBounds(10, 126, 162, 23);
		contentPane.add(cadastrarFuncionario);
		
		JButton cadastrarCliente = new JButton("Cadastrar Cliente");
		cadastrarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroCliente cadastroCliente = new CadastroCliente();
				
				cadastroCliente.setVisible(true);
				
			}
		});
		cadastrarCliente.setBounds(229, 126, 138, 23);
		contentPane.add(cadastrarCliente);
		
		JButton cadastrarPrato = new JButton("Cadastrar Prato");
		cadastrarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CadastroPrato cadastroPrato = new CadastroPrato();
				
				cadastroPrato.setVisible(true);
				
			}
		});
		cadastrarPrato.setBounds(427, 126, 131, 23);
		contentPane.add(cadastrarPrato);
		
		JButton areaDoFuncionario = new JButton("\u00C1rea do Funcion\u00E1rio");
		areaDoFuncionario.setBounds(108, 34, 150, 23);
		contentPane.add(areaDoFuncionario);
		
		JButton areaDoCliente = new JButton("\u00C1rea do Cliente");
		areaDoCliente.setBounds(328, 34, 125, 23);
		contentPane.add(areaDoCliente);
		
		JButton atualizarFuncionrio = new JButton("Atualizar Funcion\u00E1rio");
		atualizarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AtualizarPrato atualizarPrato = new AtualizarPrato();
				
				atualizarPrato.setVisible(true);
			}
		});
		atualizarFuncionrio.setBounds(10, 160, 162, 23);
		contentPane.add(atualizarFuncionrio);
		
		JButton removerFuncionrio = new JButton("Remover Funcion\u00E1rio");
		removerFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RemoverPrato removerPrato = new RemoverPrato();
				
				removerPrato.setVisible(true);
				
			}
		});
		removerFuncionrio.setBounds(10, 194, 162, 23);
		contentPane.add(removerFuncionrio);
		
		JButton procurarFuncionrio = new JButton("Procurar Funcion\u00E1rio");
		procurarFuncionrio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProcurarPrato procurarPrato = new ProcurarPrato();
				
				procurarPrato.setVisible(true);
				
			}
		});
		procurarFuncionrio.setBounds(10, 228, 162, 23);
		contentPane.add(procurarFuncionrio);
		
		JButton atualizarCliente = new JButton("Atualizar Cliente");
		atualizarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				AtualizarCliente atualizarCliente = new AtualizarCliente();
				
				atualizarCliente.setVisible(true);
				
			}
		});
		atualizarCliente.setBounds(229, 160, 138, 23);
		contentPane.add(atualizarCliente);
		
		JButton removerCliente = new JButton("Remover Cliente");
		removerCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RemoverCliente removerCliente = new RemoverCliente();
				
				removerCliente.setVisible(true);
				
			}
		});
		removerCliente.setBounds(229, 194, 138, 23);
		contentPane.add(removerCliente);
		
		JButton procurarCliente = new JButton("Procurar Cliente");
		procurarCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				ProcurarCliente procurarCliente = new ProcurarCliente();
				
				procurarCliente.setVisible(true);
				
			}
		});
		procurarCliente.setBounds(229, 228, 138, 23);
		contentPane.add(procurarCliente);
		
		JButton atualizarPrato = new JButton("Atualizar Prato");
		atualizarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				AtualizarPrato atualizarPrato = new AtualizarPrato();
				
				atualizarPrato.setVisible(true);
				
			}
		});
		atualizarPrato.setBounds(427, 160, 131, 23);
		contentPane.add(atualizarPrato);
		
		JButton removerPrato = new JButton("Remover Prato");
		removerPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				RemoverPrato removerPrato = new RemoverPrato();
				
				removerPrato.setVisible(true);
				
			}
		});
		removerPrato.setBounds(427, 194, 131, 23);
		contentPane.add(removerPrato);
		
		JButton procurarPrato = new JButton("Procurar Prato");
		procurarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				ProcurarPrato procurarPrato = new ProcurarPrato();
				
				procurarPrato.setVisible(true);
				
			}
		});
		procurarPrato.setBounds(427, 228, 131, 23);
		contentPane.add(procurarPrato);
	}
	
}
