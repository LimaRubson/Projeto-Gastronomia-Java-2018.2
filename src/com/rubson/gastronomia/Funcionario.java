package com.rubson.gastronomia;

public class Funcionario extends Pessoa {
	
	private int cargaHoraria;
	private double salario;
	private Pedido pedido;
	private String tipoFuncionario;
	
	public Funcionario(String nome, String cpf, String rg, String sexo, String endereco, String email, String telefone,
		     String observacoes, int cargaHoraria, double salario, Pedido pedido,
			String tipoFuncionario) {
		super(nome, cpf, rg, sexo, endereco, email, telefone, observacoes);
		this.cargaHoraria = cargaHoraria;
		this.salario = salario;
		this.pedido = pedido;
		this.tipoFuncionario = tipoFuncionario;
	}
	public int getCargaHoraria() {
		return cargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		this.cargaHoraria = cargaHoraria;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public Pedido getPedido() {
		return pedido;
	}
	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}
	public String getTipoFuncionario() {
		return tipoFuncionario;
	}
	public void setTipoFuncionario(String tipoFuncionario) {
		this.tipoFuncionario = tipoFuncionario;
	}
	
	public void cadastrarFuncionario() {
		
		
	}
	
	public void excluirFuncionario() {
		
	}
	
	public Funcionario pesquisarFuncionario(Funcionario funcionario) {
		
		return funcionario;
		
	}
	
	public Funcionario corrigirFuncionario(Funcionario funcionario) {
		
		return funcionario;
		
	}
	
	@Override
	public String toString() {
		return "Funcionario [cargaHoraria=" + cargaHoraria + ", salario=" + salario + ", pedido=" + pedido
				+ ", tipoFuncionario=" + tipoFuncionario + "]";
	}
	
}
