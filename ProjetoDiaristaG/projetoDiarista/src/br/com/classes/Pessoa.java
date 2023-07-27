package br.com.classes;

import br.com.classes.interfaces.Isaldo;

public abstract class Pessoa implements Isaldo {

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	
	protected String nome;
	protected String telefone;
	protected String endereco;
	
	private double getSaldo;

	public double getSaldo() {
		return getSaldo;
	}
	public void setSaldo(double Saldo) {
		this.getSaldo = Saldo;
	}
}
