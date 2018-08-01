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
import com.rubson.gastronomia.util.PratoInexistenteException;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.TextArea;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AtualizarPrato extends JFrame {
	
	Prato prato = new Prato(1, "Torta Salgada", "Manteiga, ovos, trigo e frango ou carne ou peixe...");

	private JPanel contentPane;
	private JTextField campoNomeProcurarPrato;
	private JTextField campoIdPrato;
	private JTextField campoNomePrato;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AtualizarPrato frame = new AtualizarPrato();
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
	public AtualizarPrato() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 687, 411);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel nomePratoProcurar = new JLabel("Nome do Prato:");
		nomePratoProcurar.setBounds(10, 21, 89, 14);
		contentPane.add(nomePratoProcurar);
		
		campoNomeProcurarPrato = new JTextField();
		campoNomeProcurarPrato.setBounds(109, 18, 419, 20);
		contentPane.add(campoNomeProcurarPrato);
		campoNomeProcurarPrato.setColumns(10);
		
		TextArea areaTextoIngredientesPrato = new TextArea();
		areaTextoIngredientesPrato.setBounds(148, 164, 380, 160);
		contentPane.add(areaTextoIngredientesPrato);
		
		JButton procurarPrato = new JButton("Procurar");
		procurarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int idPrato;
				String nomePrato;
				String ingredientesPrato;
				
				Fachada.getInstance().cadastrar(prato);
				
				
					
					if(campoNomeProcurarPrato.getText().equals(prato.getNome())) {
						
						try {
								idPrato = Fachada.getInstance().procurarPrato(prato.getNome()).getId();
								nomePrato = Fachada.getInstance().procurarPrato(prato.getNome()).getNome();
								ingredientesPrato = Fachada.getInstance().procurarPrato(prato.getNome()).getIngredientes();
						
						
								campoIdPrato.setText(Integer.toString(idPrato));
								campoNomePrato.setText(nomePrato);
								areaTextoIngredientesPrato.setText(ingredientesPrato);
						} catch (PratoInexistenteException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
						}
						
						
					}
					
						
				
				
			
				
			}
		});
		procurarPrato.setBounds(561, 17, 89, 23);
		contentPane.add(procurarPrato);
		
		JLabel dadosAtualizar = new JLabel("Dados para atualizar");
		dadosAtualizar.setBounds(269, 49, 121, 14);
		contentPane.add(dadosAtualizar);
		
		JLabel idPrato = new JLabel("ID:");
		idPrato.setBounds(10, 90, 46, 14);
		contentPane.add(idPrato);
		
		campoIdPrato = new JTextField();
		campoIdPrato.setBounds(66, 87, 46, 20);
		contentPane.add(campoIdPrato);
		campoIdPrato.setColumns(10);
		
		JLabel nomePrato = new JLabel("Nome do Prato:");
		nomePrato.setBounds(230, 90, 100, 14);
		contentPane.add(nomePrato);
		
		campoNomePrato = new JTextField();
		campoNomePrato.setBounds(340, 87, 261, 20);
		contentPane.add(campoNomePrato);
		campoNomePrato.setColumns(10);
		
		JLabel IngredientesPratos = new JLabel("Ingredientes");
		IngredientesPratos.setBounds(305, 148, 126, 14);
		contentPane.add(IngredientesPratos);
	
		
		JButton atualizarPrato = new JButton("Atualizar");
		atualizarPrato.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String idPrato = campoIdPrato.getText();
				String nomePrato = campoNomePrato.getText();
				String ingredientesPrato = areaTextoIngredientesPrato.getText();
				
				
				prato.setId(Integer.parseInt(idPrato));
				prato.setNome(nomePrato);
				prato.setIngredientes(ingredientesPrato);
				
				
				
				Fachada.getInstance().atualizar(prato);
				
			}
		});
		atualizarPrato.setBounds(314, 339, 89, 23);
		contentPane.add(atualizarPrato);
	}

}
