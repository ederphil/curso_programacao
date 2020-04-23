package curso_programacao;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Scanner;

public class Exercicio_97 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int l = 0, c = 0;

		System.out.println("MATRIX ");

		System.out.print("Informe a quantidade de linhas: ");
		l = sc.nextInt();

		System.out.print("Informe a quantidade de colunas: ");
		c = sc.nextInt();

		int[][] matrix = new int[l][c];

		for (int i = 0; i < l; i++) {
			// System.out.println("----------------------");
			for (int a = 0; a < c; a++) {
				matrix[i][a] = sc.nextInt();
				// System.out.print(" | ");
				// System.out.print(matrix[i][a]);
			}
		}

		System.out.println();
		System.out.print("Informe o número que deseja buscar: ");
		int buscarNro = sc.nextInt();

		System.out.println();

		NumberFormat formatter = new DecimalFormat("00");

		for (int i = 0; i < l; i++) {
			System.out.println("---------------------");
			for (int a = 0; a < c; a++) {
				// matrix[i][a] = sc.nextInt();

				if (a == 0) {
					System.out.print("| ");
				} else {
					System.out.print(" | ");
				}

				String s = formatter.format(matrix[i][a]);

				System.out.print(s);
			}

			System.out.print(" |");
			System.out.println();

		}

		System.out.println("---------------------");

		System.out.println();

		Integer esquerda, direita, baixo, cima;

		for (int i = 0; i < l; i++) {

			for (int a = 0; a < c; a++) {

				// matrix[i][a] = sc.nextInt();

				if (matrix[i][a] == buscarNro) {

					System.out.println("Posição: " + i + "," + a);

					if (a - 1 >= 0) {
						esquerda = matrix[i][a - 1];

						if (esquerda != null) {
							System.out.println("Esquerda: " + esquerda);
						}

					}

					if (a + 1 < c) {
						direita = matrix[i][a + 1];

						if (direita != null) {
							System.out.println("Direita: " + direita);
						}
					}

					if (i + 1 < l) {
						baixo = matrix[i + 1][a];

						if (baixo != null) {
							System.out.println("Abaixo: " + baixo);
						}
					}

					if (i - 1 >= 0) {
						cima = matrix[i - 1][a];

						if (cima != null) {
							System.out.println("Acima: " + cima);
						}
					}

					System.out.println();

				}

			}
		}
		sc.close();
	}

}
