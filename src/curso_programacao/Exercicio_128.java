package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Funcionario_128;
import entities.Funcionario_128_terceiro;

public class Exercicio_128 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Funcionario_128> funcList = new ArrayList<Funcionario_128>();

		System.out.print("Informe o número de funcionários: ");
		int nroFuncionarios = sc.nextInt();

		for (int i = 0; i < nroFuncionarios; i++) {
			System.out.println("--------------------------------------------------------");
			System.out.print("Terceirizado: ");
			char terceirizado = sc.next().charAt(0);

			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Horas: ");
			int horas = sc.nextInt();

			System.out.print("Valor por hora: ");
			Double valorHora = sc.nextDouble();

			if (Character.toUpperCase(terceirizado) == 'S') {

				System.out.print("Adicional: ");
				Double adicional = sc.nextDouble();

				Funcionario_128 func = new Funcionario_128_terceiro(nome, horas, valorHora, adicional);
				funcList.add(func);

			} else {
				Funcionario_128 func = new Funcionario_128(nome, horas, valorHora);
				funcList.add(func);
			}

		}

		System.out.println();
		System.out.println("PAGAMENTOS: ");

		for (Funcionario_128 func : funcList) {
			System.out.println(func.getNome() + " - R$ " + String.format("%.2f", func.pagamento()));
		}

		sc.close();

	}

}
