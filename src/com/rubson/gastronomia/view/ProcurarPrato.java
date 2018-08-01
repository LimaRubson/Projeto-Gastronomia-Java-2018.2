package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Prato;
import com.rubson.gastronomia.util.FuncionarioInexistenteException;
import com.rubson.gastronomia.util.PratoInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.List;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ProcurarPrato extends JFrame {

	private JPanel contentPane;
	private JTextField campoNomePrato;
	
	
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ProcurarPrato frame = new ProcurarPrato();
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
	public ProcurarPrato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 625, 315);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomeProcurarPrato = new JLabel("Nome do Prato:");
		nomeProcurarPrato.setBounds(10, 11, 95, 14);
		contentPane.add(nomeProcurarPrato);
		
		campoNomePrato = new JTextField();
		campoNomePrato.setBounds(115, 8, 372, 20);
		contentPane.add(campoNomePrato);
		campoNomePrato.setColumns(10);
		
		List campoDadosPrato = new List();
		campoDadosPrato.setBounds(115, 121, 383, 146);
		contentPane.add(campoDadosPrato);
		
		JButton procurarPrato = new JButton("Procurar");
		procurarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Fachada.getInstance().cadastrar(prato);
				
				if(campoNomePrato.getText().equals(prato.getNome())) {
					
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
		procurarPrato.setBounds(510, 7, 89, 23);
		contentPane.add(procurarPrato);
		
		JLabel dadosDoPrato = new JLabel("Dados do Prato");
		dadosDoPrato.setBounds(263, 68, 119, 14);
		contentPane.add(dadosDoPrato);
		
		
	}

}
