package com.rubson.gastronomia.view;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import com.rubson.gastronomia.controller.Fachada;
import com.rubson.gastronomia.controller.Prato;

import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.TextArea;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroPrato extends JFrame {

	private JPanel contentPane;
	private JTextField campoId;
	private JTextField campoNome;
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroPrato frame = new CadastroPrato();
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
	public CadastroPrato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 310);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(10, 23, 46, 14);
		contentPane.add(lblId);
		
		campoId = new JTextField();
		campoId.setBounds(39, 20, 86, 20);
		contentPane.add(campoId);
		campoId.setColumns(10);
		
		JLabel nome = new JLabel("Nome:");
		nome.setBounds(147, 23, 46, 14);
		contentPane.add(nome);
		
		campoNome = new JTextField();
		campoNome.setBounds(218, 20, 193, 20);
		contentPane.add(campoNome);
		campoNome.setColumns(10);
		
		JLabel ingredientes = new JLabel("Ingredientes");
		ingredientes.setBounds(190, 62, 86, 14);
		contentPane.add(ingredientes);
		
		TextArea areaTextoIngredientes = new TextArea();
		areaTextoIngredientes.setBounds(39, 83, 359, 129);
		contentPane.add(areaTextoIngredientes);
		
		JButton btnAdicionar = new JButton("Adicionar");
		btnAdicionar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				prato.setId(Integer.parseInt(campoId.getText()));
				prato.setNome(campoNome.getText());
				prato.setIngredientes(areaTextoIngredientes.getText());
				
				Fachada.getInstance().cadastrar(prato);
				
			}
		});
		btnAdicionar.setBounds(177, 238, 89, 23);
		contentPane.add(btnAdicionar);
	}

}
