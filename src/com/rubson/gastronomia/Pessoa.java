package com.rubson.gastronomia;

public abstract class Pessoa {
	
	private String nome;
	private String cpf;
	private String rg;
	private String sexo;
	private String endereco;
	private String email;
	private String telefone;
	private String observacoes;
	
	public Pessoa(String nome, String cpf, String rg, String sexo, String endereco, String email, String telefone,
			 String observacoes) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.rg = rg;
		this.sexo = sexo;
		this.endereco = endereco;
		this.email = email;
		this.telefone = telefone;
		this.observacoes = observacoes;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getRg() {
		return rg;
	}
	public void setRg(String rg) {
		this.rg = rg;
	}
	public String getSexo() {
		return sexo;
	}
	public void setSexo(String sexo) {
		this.sexo = sexo;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getObservacoes() {
		return observacoes;
	}
	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}
	
	@Override
	public String toString() {
		return "Pessoa [nome=" + nome + ", cpf=" + cpf + ", rg=" + rg + ", sexo=" + sexo + ", endereco=" + endereco
				+ ", email=" + email + ", telefone=" + telefone +  ", observacoes="
				+ observacoes + "]";
	}
}
