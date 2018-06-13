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
	
	@Override
	public String getNome() {
		// TODO Auto-generated method stub
		return super.getNome();
	}

	@Override
	public void setNome(String nome) {
		// TODO Auto-generated method stub
		super.setNome(nome);
	}

	@Override
	public String getCpf() {
		// TODO Auto-generated method stub
		return super.getCpf();
	}

	@Override
	public void setCpf(String cpf) {
		// TODO Auto-generated method stub
		super.setCpf(cpf);
	}

	@Override
	public String getRg() {
		// TODO Auto-generated method stub
		return super.getRg();
	}

	@Override
	public void setRg(String rg) {
		// TODO Auto-generated method stub
		super.setRg(rg);
	}

	@Override
	public String getSexo() {
		// TODO Auto-generated method stub
		return super.getSexo();
	}

	@Override
	public void setSexo(String sexo) {
		// TODO Auto-generated method stub
		super.setSexo(sexo);
	}

	@Override
	public String getEndereco() {
		// TODO Auto-generated method stub
		return super.getEndereco();
	}

	@Override
	public void setEndereco(String endereco) {
		// TODO Auto-generated method stub
		super.setEndereco(endereco);
	}

	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	@Override
	public String getTelefone() {
		// TODO Auto-generated method stub
		return super.getTelefone();
	}

	@Override
	public void setTelefone(String telefone) {
		// TODO Auto-generated method stub
		super.setTelefone(telefone);
	}

	@Override
	public String getObservacoes() {
		// TODO Auto-generated method stub
		return super.getObservacoes();
	}

	@Override
	public void setObservacoes(String observacoes) {
		// TODO Auto-generated method stub
		super.setObservacoes(observacoes);
	}

	@Override
	public String toString() {
		return "Funcionario [cargaHoraria=" + cargaHoraria + ", salario=" + salario + ", pedido=" + pedido
				+ ", tipoFuncionario=" + tipoFuncionario + "]";
	}
	
}
