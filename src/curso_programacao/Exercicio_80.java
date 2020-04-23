package curso_programacao;

import java.util.Scanner;

import entity.Conta;

public class Exercicio_80 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int nroConta;
		double saldo = 0;

		System.out.print("Informe o número da conta: ");
		nroConta = sc.nextInt();

		System.out.print("Informe o nome do titular da conta: ");
		sc.nextLine();
		String nomeTitular = sc.nextLine();

		System.out.print("Deseja fazer um depósito inicial ( S/N ): ");

		switch (sc.next().charAt(0)) {
		case 'S':
		case 's':

			System.out.print("Infome o valor do depósito inicial: ");
			saldo = sc.nextDouble();

			break;

		default:
			break;
		}

		System.out.println();
		Conta conta = new Conta(nroConta, nomeTitular, saldo);

		System.out.println("Dados da conta: ");
		System.out.println(conta);

		System.out.print("Informe o valor de depósito: ");
		conta.deposito(sc.nextDouble());
		System.out.println();

		System.out.println("Dados da conta: ");
		System.out.println(conta);
		System.out.println();

		System.out.print("Informe o valor de saque: ");
		conta.saque(sc.nextDouble());

		System.out.println("Dados da conta: ");
		System.out.println(conta);

		sc.close();

	}

}
