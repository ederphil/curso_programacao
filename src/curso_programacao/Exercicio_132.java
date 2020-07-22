package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.PessoaJuridica_131;
import entities.Pessoa_132;
import entities.PessoalFisica_131;

public class Exercicio_132 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o nro de pessoas: ");
		int nroPessoa = sc.nextInt();

		List<Pessoa_132> listPessoa = new ArrayList<Pessoa_132>();

		for (int i = 1; i <= nroPessoa; i++) {
			System.out.println();
			System.out.println("---------------------------");
			System.out.println("Dados pessoa #" + i);
			System.out.println("---------------------------");
			System.out.print("(I)ndividual ou (C)ompanhia: ");
			char tipoPessoa = Character.toUpperCase(sc.next().charAt(0));

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Renda Anual: ");
			double rendaAnual = sc.nextDouble();

			if (tipoPessoa == 'I') {
				System.out.print("Gastos Saúde: ");
				double gastosSaude = sc.nextDouble();
				listPessoa.add(new PessoalFisica_131(nome, rendaAnual, gastosSaude));
			} else if (tipoPessoa == 'C') {

				System.out.print("Número de Funcionários: ");
				int nroFunc = sc.nextInt();
				listPessoa.add(new PessoaJuridica_131(nome, rendaAnual, nroFunc));

			} else {
				System.out.println("Opção não encontrada!");
				System.exit(0);
			}

		}

		double impostoConsolidado = 0;

		System.out.println();
		System.out.println("Imposto pago: ");

		for (Pessoa_132 pessoa : listPessoa) {

			double impostoIndividual = pessoa.calculaImposto();
			impostoConsolidado += impostoIndividual;
			System.out.println(pessoa.getNome() + ": R$ " + String.format("%.2f", impostoIndividual));

		}

		System.out.println();
		System.out.println("Total de impostos: " + String.format("%.2f", impostoConsolidado));

		sc.close();
	}

}
