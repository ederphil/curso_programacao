package curso_programacao;

import java.util.Scanner;

public class Exercicio_52 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int exercicio = 0;

		System.out.print("Informe o exercicio que deseja executar: ");
		exercicio = sc.nextInt();

		if (exercicio == 1) {
			System.out.println("-----------------------------------------");
			exercicio_01(sc);
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
		} else if (exercicio == 7) {
			System.out.println("-----------------------------------------");
			exercicio_07(sc);
		}

		sc.close();

	}

	public static void exercicio_01(Scanner sc) {
		System.out.println("EXERCICIO 01");

		int x = 0;

		System.out.print("Informe o valor final: ");
		x = sc.nextInt();

		for (int i = 1; i <= x; i++) {

			if (i % 2 != 0) {
				System.out.println(i);
			}

		}

	}

	public static void exercicio_02(Scanner sc) {

		System.out.println("EXERCICIO 02");

		int n = 0, countIn = 0, countOut = 0, vlEntrada = 0;

		System.out.print("Informe a quantidades de números a serem lidos: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			System.out.print("Informe o número(" + i + "):");
			vlEntrada = sc.nextInt();

			if (vlEntrada >= 10 && vlEntrada <= 20) {
				countIn += 1;
			} else {
				countOut += 1;
			}

		}
		System.out.println(countIn + " IN");
		System.out.println(countOut + " OUT");

	}

	public static void exercicio_03(Scanner sc) {

		System.out.println("EXERCICIO 03");
		int nroVezes = 0;
		double nro1 = 0, nro2 = 0, nro3 = 0;

		System.out.print("Informe a quantidade de vezes:");
		nroVezes = sc.nextInt();

		for (int i = 1; i <= nroVezes; i++) {

			System.out.print("Informe o valor(" + i + "/1" + "):");
			nro1 = sc.nextDouble();

			System.out.print("Informe o valor(" + i + "/2" + "):");
			nro2 = sc.nextDouble();

			System.out.print("Informe o valor(" + i + "/3" + "):");
			nro3 = sc.nextDouble();

			double media = (nro1 * 2.0 + nro2 * 3.0 + nro3 * 5.0) / 10.0;

			System.out.printf("Média Ponderada(" + i + "): %.1f%n", media);
			System.out.println();
		}

	}

	public static void exercicio_04(Scanner sc) {

		System.out.println("EXERCICIO 04");

		int nroVezes = 0, nro1 = 0, nro2 = 0;
		double resultado;

		System.out.print("Informe o nro de vezes: ");
		nroVezes = sc.nextInt();

		for (int i = 1; i <= nroVezes; i++) {

			System.out.print("Informe o valor para o nro (" + i + "/1): ");
			nro1 = sc.nextInt();

			System.out.print("Informe o valor para o nro (" + i + "/2): ");
			nro2 = sc.nextInt();

			if (nro2 == 0) {
				System.out.println("Divisão Impossível.");

			} else {
				resultado = (double) nro1 / nro2;
				System.out.printf("Resultado: %.2f \n", resultado);
			}

			System.out.println();

		}

	}

	public static void exercicio_05(Scanner sc) {
		System.out.println("EXERCICIO 05");

		int n = 0;
		double resultado = 1;

		System.out.print("Informe o Nro a ser fatorado: ");
		n = sc.nextInt();

		resultado = (n > 0 ? n : 1);

		for (int i = n; i > 1; i--) {
			resultado *= (double) (i - 1);
		}

		System.out.println("Resultado: " + resultado);

	}

	public static void exercicio_06(Scanner sc) {
		System.out.println("EXERCICIO 06");

		int n = 0;

		System.out.print("Informe um número: ");
		n = sc.nextInt();

		for (int i = n; i > 0; i--) {

			if (n % i == 0) {
				System.out.println(i);
			}

		}

	}

	public static void exercicio_07(Scanner sc) {
		System.out.println("EXERCICIO 07");

		int n = 0;

		System.out.print("Informe um número inteiro:");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {

			int resultado2 = i * i;
			int resultado3 = i * resultado2;
			System.out.println(i + " - " + resultado2 + " - " + resultado3);

		}

	}

}
