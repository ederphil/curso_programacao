package curso_programacao;

import java.util.Scanner;

public class Exercicio_35 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int exercicio = 0;

		System.out.print("Informe o exercicio que deseja executar: ");
		exercicio = sc.nextInt();

		if (exercicio == 1) {
			System.out.println("-----------------------------------------");
			exercicio_01();
		} else if (exercicio == 2) {
			System.out.println("-----------------------------------------");
			exercicio_02(sc);
		} else if (exercicio == 3) {
			System.out.println("-----------------------------------------");
			exercicio_03(sc);
		} else if (exercicio == 4) {
			System.out.println("-----------------------------------------");
			exercicio_04(sc);
		} else if (exercicio == 5) {
			System.out.println("-----------------------------------------");
			exercicio_05(sc);
		} else if (exercicio == 6) {
			System.out.println("-----------------------------------------");
			exercicio_06(sc);
		}

		sc.close();

	}

	public static void exercicio_01() {
		System.out.println("EXERCICIO 01");

		Scanner sc = new Scanner(System.in);

		int num = 0;

		System.out.print("Informe um número: ");
		num = sc.nextInt();

		if (num >= 0) {
			System.out.println("Não negativo");
		} else {
			System.out.println("Negativo");
		}

		sc.close();

	}

	public static void exercicio_02(Scanner sc) {

		System.out.println("EXERCICIO 02");

		System.out.print("Informe um numero: ");
		int num = sc.nextInt();

		if (num % 2 == 0) {
			System.out.println("PAR");
		} else {
			System.out.println("IMPAR");
		}

	}

	public static void exercicio_03(Scanner sc) {

		System.out.println("EXERCICIO 03");

		System.out.print("Informe o numero 1: ");
		int num1 = sc.nextInt();

		System.out.print("Informe o numero 2: ");
		int num2 = sc.nextInt();

		if ((num1 % num2 == 0) || (num2 % num1 == 0)) {
			System.out.println("São MULTIPLOS");
		} else {
			System.out.println("Nao são MULTIPLOS");
		}

	}

	public static void exercicio_04(Scanner sc) {

		System.out.println("EXERCICIO 04");

		int horaInicial, horaFinal, qtdHoras;

		System.out.print("Informe a hora inicial: ");
		horaInicial = sc.nextInt();

		System.out.print("Informe a hora final: ");
		horaFinal = sc.nextInt();

		if (horaInicial > horaFinal) {
			qtdHoras = 24 - horaInicial + horaFinal;
		} else {

			qtdHoras = horaFinal - horaInicial;

			if (qtdHoras == 0) {
				qtdHoras = 24;
			}

		}

		System.out.println("O jogo durou " + qtdHoras + " HORA(S)");
	}

	public static void exercicio_05(Scanner sc) {

		System.out.println("EXERCICIO 05");

		int codItem, qtdItem;
		String especificacao = null;
		Double vlItem = null;

		System.out.print("Informe o código do Item: ");
		codItem = sc.nextInt();

		if (codItem == 1) {
			especificacao = "Cachorro Quente";
			vlItem = 4.00;
		} else if (codItem == 2) {
			especificacao = "X-Salada";
			vlItem = 4.50;
		} else if (codItem == 3) {
			especificacao = "X-Bacon";
			vlItem = 5.00;
		} else if (codItem == 4) {
			especificacao = "Torrada Simples";
			vlItem = 2.00;
		} else if (codItem == 5) {
			especificacao = "Refrigerante";
			vlItem = 1.50;
		}

		System.out.printf(codItem + " - " + especificacao + " - R$ %.2f \n", vlItem);

		System.out.print("Informe quantidade: ");
		qtdItem = sc.nextInt();

		System.out.printf("Total: R$ %.2f", qtdItem * vlItem);
	}

	public static void exercicio_06(Scanner sc) {

		System.out.println("EXERCICIO 06");

		Double vlr;

		System.out.print("Informe um valor: ");
		vlr = sc.nextDouble();
		
		if (vlr > 25 && vlr <= 50) {
			System.out.println("Intervalo [25,50] ");
		} else if (vlr >= 0 && vlr <= 25) {
			System.out.println("Intervalo [0,25]");
		} else if (vlr >= 75 && vlr <= 100) {
			System.out.println("Intervalo [75,100]");
		} else {
			System.out.println("Fora de intervalo");
		}

	}

}
