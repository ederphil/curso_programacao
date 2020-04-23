package curso_programacao;

import java.util.Scanner;

public class Exercicio_28 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int exercicio = 0;

		System.out.print("Informe o exercicio que deseja executar: ");
		exercicio = sc.nextInt();

		if (exercicio == 1) {
			System.out.println("-----------------------------------------");
			exercicio_01(args);
		} else if (exercicio == 2) {
			System.out.println("-----------------------------------------");
			exercicio_02();
		} else if (exercicio == 3) {
			System.out.println("-----------------------------------------");
			exercicio_03();
		} else if (exercicio == 4) {
			System.out.println("-----------------------------------------");
			exercicio_04();
		} else if (exercicio == 5) {
			System.out.println("-----------------------------------------");
			exercicio_05();
		} else if (exercicio == 6) {
			System.out.println("-----------------------------------------");
			exercicio_06();
		}

		sc.close();
	}

	public static void exercicio_01(String[] args) {

		System.out.println("EXERCICIO 01");
		Scanner sc = new Scanner(System.in);
		int valor1, valor2, resultado;

		System.out.print("Informe o valor: ");
		valor1 = sc.nextInt();

		System.out.println("+");

		System.out.print("Informe o valor: ");
		valor2 = sc.nextInt();

		resultado = valor1 + valor2;

		System.out.println("Resultado: " + resultado);

		sc.close();
	}

	public static void exercicio_02() {

		System.out.println("EXERCICIO 02");

		Scanner sc = new Scanner(System.in);

		Double pi = 3.14159;
		Double area, raio = 0.0;
		System.out.print("Informe o Raio de um circulo: ");
		raio = sc.nextDouble();

		area = pi * Math.pow(raio, 2);

		System.out.printf("A area é: %.4f \n", area);

		sc.close();

	}

	public static void exercicio_03() {

		System.out.println("EXERCICIO 03");

		Scanner sc = new Scanner(System.in);
		int a, b, c, d, diferenca;
		System.out.println("Informe 4 valores:");
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();
		d = sc.nextInt();

		diferenca = (a * b) - (c * d);

		System.out.println("Diferença: " + diferenca);

		sc.close();

	}

	public static void exercicio_04() {

		System.out.println("EXERCICIO 04");

		Scanner sc = new Scanner(System.in);
		int nroFunc = 0;
		Double numHoras, valorHora, salFunc;

		System.out.print("Informe o número do funcionário: ");
		nroFunc = sc.nextInt();

		System.out.print("Informe o número de horas: ");
		numHoras = sc.nextDouble();

		System.out.print("Informe o valor da hora: ");
		valorHora = sc.nextDouble();

		salFunc = valorHora * numHoras;

		System.out.println();

		System.out.println("Número: " + nroFunc);
		System.out.printf("Salário R$: %.2f \n", salFunc);

		sc.close();
	}

	public static void exercicio_05() {

		System.out.println("EXERCICIO 05");

		Scanner sc = new Scanner(System.in);

		int codPeca1, codPeca2, numPeca1, numPeca2;
		Double vlPeca1, vlPeca2, total;

		System.out.print("Informe o código da peça 1: ");
		codPeca1 = sc.nextInt();

		System.out.print("Informe a quantidade da peça 1: ");
		numPeca1 = sc.nextInt();

		System.out.print("Informe o valor da peça 1: ");
		vlPeca1 = sc.nextDouble();

		System.out.print("Informe o código da peça 2: ");
		codPeca2 = sc.nextInt();

		System.out.print("Informe a quantidade da peça 2: ");
		numPeca2 = sc.nextInt();

		System.out.print("Informe o valor da peça 2: ");
		vlPeca2 = sc.nextDouble();

		total = (numPeca1 * vlPeca1) + (numPeca2 * vlPeca2);

		System.out.printf("Valor total: %.2f \n", total);

		sc.close();
	}

	public static void exercicio_06() {

		System.out.println("EXERCICIO 06");

		Scanner sc = new Scanner(System.in);
		Float a, b, c, areaTriangulo, areaCirculo, areaTrapezio, areaQuadrado, areaRetangulo, pi = 3.14159f;

		System.out.print("Informe 3 valores: ");
		a = sc.nextFloat();
		b = sc.nextFloat();
		c = sc.nextFloat();

		areaTriangulo = (a * c) / 2;
		areaCirculo = pi * (float) Math.pow(c, 2);
		areaTrapezio = ((a + b) * c) / 2;
		areaQuadrado = (float) Math.pow(b, 2);
		areaRetangulo = a * b;

		System.out.printf("Area do triangulo : %.3f \n", areaTriangulo);
		System.out.printf("Area do circulo : %.3f \n", areaCirculo);
		System.out.printf("Area do trapezio : %.3f \n", areaTrapezio);
		System.out.printf("Area do quadrado : %.3f \n", areaQuadrado);
		System.out.printf("Area do retangulo : %.3f \n", areaRetangulo);

		sc.close();
	}
}
