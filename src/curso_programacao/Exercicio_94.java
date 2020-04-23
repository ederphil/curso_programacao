package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entity.Funcionario94;

public class Exercicio_94 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int qtdFunc = 0;
		Funcionario94 func;
		int id;
		String nome;
		Double salario;
		int percAumento = 0;

		List<Funcionario94> listFunc = new ArrayList<Funcionario94>();

		System.out.print("Quantos funcionários irá registrar? ");
		qtdFunc = sc.nextInt();

		for (int i = 1; i <= qtdFunc; i++) {

			System.out.println();
			System.out.println("Funcionário #" + i + ":");

			System.out.print("Id: ");
			id = sc.nextInt();

			System.out.print("Nome: ");
			sc.nextLine();
			nome = sc.nextLine();

			System.out.print("Salario: ");
			salario = sc.nextDouble();

			func = new Funcionario94(id, nome, salario);
			listFunc.add(func);

		}

		System.out.println();

		System.out.print("Informe o id do funcionário que quer aumentar: ");
		int idAlterar = sc.nextInt();

		Funcionario94 funcAlterar = listFunc.stream().filter(x -> x.getId() == idAlterar).findFirst().orElse(null);

		if (funcAlterar == null) {
			System.out.println("Este id não existe.");
		} else {

			System.out.print("Informe o percentual: ");
			percAumento = sc.nextInt();
			funcAlterar.addSalario(percAumento);
		}

		System.out.println();

		System.out.println("Lista de funcionários: ");
		for (Funcionario94 x : listFunc) {
			System.out.println(x.toString());
		}

		sc.close();

	}

}
