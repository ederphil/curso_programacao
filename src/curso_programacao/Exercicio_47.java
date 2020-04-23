package curso_programacao;

import java.util.Scanner;

public class Exercicio_47 {

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
//			exercicio_04(sc);
		} else if (exercicio == 5) {
			System.out.println("-----------------------------------------");
//			exercicio_05(sc);
		} else if (exercicio == 6) {
			System.out.println("-----------------------------------------");
//			exercicio_06(sc);
		}

		sc.close();

	}

	public static void exercicio_01(Scanner sc) {
		System.out.println("EXERCICIO 01");

		int senha = 0;

		System.out.print("Informe a senha para continuar: ");
		senha = sc.nextInt();

		while (senha != 2002) {

			System.out.println("Senha inválida!");
			System.out.print("Informe a senha para continuar: ");
			senha = sc.nextInt();

		}

		System.out.println("Acesso permitido!");

	}

	public static void exercicio_02(Scanner sc) {

		System.out.println("EXERCICIO 02");

		Integer x = 0, y = 0;

		while (x != 0 || y != 0) {

			System.out.print("Informe um valor para X:");
			x = sc.nextInt();

			System.out.print("Informe um valor para Y:");
			y = sc.nextInt();

			if (x > 0) {

				if (y > 0) {
					System.out.println("Primeiro Quadrante!");
				} else {
					System.out.println("Quarto Quadrante");
				}

			} else {

				if (y < 0) {
					System.out.println("Terceiro Quadrante!");
				} else {
					System.out.println("Segundo Quadrante");
				}

			}

		}

	}

	public static void exercicio_03(Scanner sc) {

		System.out.println("EXERCICIO 03");

		int tipoCombustivel = 0, countAlcool = 0, countGasolina = 0, countDiesel = 0;

		while (tipoCombustivel != 4) {

			System.out.print("Tipos de combustiveis:\n" + "	Álcool      = 1\n" + "	Gasolina    = 2\n"
					+ "	Diesel      = 3\n" + "	Sair        = 4\n" + "Informe o combustível usado: ");

			tipoCombustivel = sc.nextInt();

			switch (tipoCombustivel) {
			case 1:
				countAlcool += 1;
				break;
			case 2:
				countGasolina += 1;
				break;
			case 3:
				countDiesel += 1;
				break;

			default:
				break;
			}

		}

		System.out.println();	
		System.out.println("MUITO OBRIGADO!");
		System.out.println("Alcool	: " + countAlcool);
		System.out.println("Gasolina: " + countGasolina);
		System.out.println("Diesel	: " + countDiesel);

	}
	
	
	
}
