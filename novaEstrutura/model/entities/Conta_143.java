package model.entities;

import model.exceptions.NegocioException;

public class Conta_143 {

	private int nroConta;
	private String nome;
	private double saldoConta;
	private double limiteSaque;

	public Conta_143(int nroConta, String nome, double limiteSaque) {
		this.nroConta = nroConta;
		this.nome = nome;
		this.limiteSaque = limiteSaque;
	}

	public int getNroConta() {
		return nroConta;
	}

	public void setNroConta(int nroConta) {
		this.nroConta = nroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public double getSaldoConta() {
		return saldoConta;
	}

	public void deposito(double valor) {
		saldoConta += valor;
	}

	public String saque(double valor) throws NegocioException {

		if (valor > limiteSaque) {
			throw new NegocioException("Erro saque: Valor maior que o limite de saque.");

		} else if (valor > saldoConta) {
			throw new NegocioException("Erro saque: Valor maior que o saldo da conta.");
		}

		saldoConta -= valor;

		return "Novo saldo: " + String.format("%.2f", saldoConta);

	}

}
