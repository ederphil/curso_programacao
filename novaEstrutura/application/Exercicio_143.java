package application;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.entities.Conta_143;
import model.exceptions.NegocioException;

public class Exercicio_143 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Informe os dados da conta");

		int nroConta = 0;
		String nome;

		try {

			System.out.print("Número: ");
			nroConta = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();

			System.out.print("Saldo inicial: ");
			double saldoInicial = sc.nextDouble();

			System.out.print("Limite de saque: ");
			double limiteSaque = sc.nextDouble();

			Conta_143 conta = new Conta_143(nroConta, nome, limiteSaque);
			conta.deposito(saldoInicial);

			System.out.println();
			System.out.print("Informe o valor do saque: ");
			double saque = sc.nextDouble();

			System.out.print(conta.saque(saque));

		} catch (InputMismatchException e) {
			System.out.println("Erro: Informe somente números.");
		} catch (NegocioException e) {
			System.out.println(e.getMessage());
		}

		sc.close();
	}

}
