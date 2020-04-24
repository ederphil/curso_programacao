package entities;

public class Conta {

	private int conta;
	private String nomeTitular;
	private double saldo;
	private double TAXA = 5.00;

	public Conta(int conta, String nomeTitular, double saldo) {
		this.conta = conta;
		this.nomeTitular = nomeTitular;
		deposito(saldo);
	}

	public Conta(int conta, String nomeTitular) {
		this.conta = conta;
		this.nomeTitular = nomeTitular;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void deposito(double valor) {
		saldo += valor;
	}

	public void saque(double valor) {
		saldo -= (valor + TAXA);
	}

	public String toString() {
		return "Conta: " + conta + ", Titular: " + nomeTitular + ", Saldo: R$ " + String.format("%.2f ", saldo);
	}

}
