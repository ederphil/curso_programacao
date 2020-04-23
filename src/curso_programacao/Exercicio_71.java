package curso_programacao;

import java.util.Scanner;

import util.ConversorMoedas;

public class Exercicio_71 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double vlDolar, qtdDolar;
		System.out.print("Quanto está a cotação do dolar: ");
		vlDolar = sc.nextDouble();

		System.out.print("Quantos dolar deseja comprar: ");
		qtdDolar = sc.nextDouble();

		System.out.printf("Total em reais: %.2f ", ConversorMoedas.dolarParaReal(qtdDolar, vlDolar));

		sc.close();

	}

}
