package curso_programacao;

import java.util.Scanner;

import entities.Aluno;
import entities.Funcionario;
import entities.Retangulo;

public class Exercicio_68 {

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
		}

		sc.close();

	}

	public static void exercicio_01(Scanner sc) {

		System.out.println("EXERCICIO 01");
		Retangulo retangulo = new Retangulo();

		System.out.print("Informe a Altura: ");
		retangulo.altura = sc.nextDouble();

		System.out.print("Informe a Largura: ");
		retangulo.largura = sc.nextDouble();

		System.out.printf("Area: %.2f \n", retangulo.area());
		System.out.printf("Perimetro: %.2f \n", retangulo.perimetro());
		System.out.printf("Diagonal: %.2f \n", retangulo.diagonal());

	}

	public static void exercicio_02(Scanner sc) {

		System.out.println("EXERCICIO 02");

		Funcionario func = new Funcionario();

		System.out.println("Dados do funcionário");
		System.out.print("Nome: ");
		sc.nextLine();
		func.nome = sc.nextLine();

		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();

		System.out.print("Impostos: ");
		func.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + func);

		System.out.println();
		System.out.print("Qual percental de incremento de salário? ");
		func.incrementaSalario(sc.nextDouble());

		System.out.println("Dados Atualizados: " + func);

	}

	public static void exercicio_03(Scanner sc) {

		System.out.println("EXERCICIO 03");

		Aluno aluno = new Aluno();

		System.out.print("Informe o nome do Aluno: ");
		sc.nextLine();
		aluno.nome = sc.nextLine();

		System.out.print("Informe a primeira nota: ");
		aluno.primeiraNota = sc.nextInt();
		System.out.print("Informe a segunda nota: ");
		aluno.segundaNota = sc.nextInt();
		System.out.print("Informe a terceira nota: ");
		aluno.terceiraNota = sc.nextInt();

		System.out.println(aluno);

	}

}
