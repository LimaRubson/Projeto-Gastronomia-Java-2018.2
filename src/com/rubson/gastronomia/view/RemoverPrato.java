package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.util.PratoInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class RemoverPrato extends JFrame {
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");

	private JPanel contentPane;
	private JTextField campoNomeProcurarPrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					RemoverPrato frame = new RemoverPrato();
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
	public RemoverPrato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 617, 328);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeDoPrato = new JLabel("Nome do Prato:");
		nomeDoPrato.setBounds(10, 11, 93, 14);
		contentPane.add(nomeDoPrato);
		
		campoNomeProcurarPrato = new JTextField();
		campoNomeProcurarPrato.setBounds(113, 8, 359, 20);
		contentPane.add(campoNomeProcurarPrato);
		campoNomeProcurarPrato.setColumns(10);
		
		List campoDadosPrato = new List();
		campoDadosPrato.setBounds(114, 100, 358, 130);
		contentPane.add(campoDadosPrato);
		
		JButton procurarPrato = new JButton("Procurar");
		procurarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				Fachada.getInstance().cadastrar(prato);
				
				if(campoNomeProcurarPrato.getText().equals(prato.getNome())) {
					
					try {
						
							campoDadosPrato.add("ID: " + Fachada.getInstance().procurarPrato(prato.getNome()).getId());
							campoDadosPrato.add("Nome: " + Fachada.getInstance().procurarPrato(prato.getNome()).getNome());
							campoDadosPrato.add("Ingredientes: " + Fachada.getInstance().procurarPrato(prato.getNome()).getIngredientes());
						
					
					} catch (PratoInexistenteException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
					
				}
				
			}
		});
		procurarPrato.setBounds(502, 7, 89, 23);
		contentPane.add(procurarPrato);
		
		JLabel dadosDoPrato = new JLabel("Dados do Prato");
		dadosDoPrato.setBounds(257, 59, 133, 14);
		contentPane.add(dadosDoPrato);
		
		JButton removerPrato = new JButton("Remover");
		removerPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				if(campoNomeProcurarPrato.getText().equals(prato.getNome())) {
					
					Fachada.getInstance().removerFuncionario(prato.getNome());
					
				}
				
			}
		});
		removerPrato.setBounds(257, 256, 89, 23);
		contentPane.add(removerPrato);
		
		
	}
}
