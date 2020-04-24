package curso_programacao;

import java.util.Scanner;

import entities.Hospedes;

public class Exercicio_89 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdQuartos;
		String nome, email;
		int nroQuarto;

		System.out.print("Quantos reservas (1-9): ");
		qtdQuartos = sc.nextInt();

		Hospedes[] hospedes = new Hospedes[10];

		for (int i = 1; i <= qtdQuartos; i++) {

			System.out.println("Reserva #" + i);

			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();

			System.out.print("Email: ");
			email = sc.nextLine();

			System.out.print("Quarto: ");
			nroQuarto = sc.nextInt();

			hospedes[nroQuarto] = new Hospedes(nome, email, nroQuarto);

			System.out.println();

		}

		System.out.println("Quartos ocupados:");

		for (int i = 0; i < hospedes.length; i++) {

			if (hospedes[i] != null) {
				System.out.println(hospedes[i].getNroQuarto() + ": " + hospedes[i].getNome() + ", "
						+ hospedes[i].getEmail().toLowerCase());
			}

		}

		sc.close();

	}

}
