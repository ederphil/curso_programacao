package curso_programacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circulo_131;
import entities.Forma_131;
import entities.Retangulo_131;
import entities.enums.Cor;

public class Exercicio_131 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Informe o número de formas: ");
		int nroFormas = sc.nextInt();
		List<Forma_131> listForma = new ArrayList<Forma_131>();

		for (int i = 1; i <= nroFormas; i++) {

			System.out.println("----------------------------");

			System.out.println("Dados formas #" + i);

			System.out.print("(R)etangulo ou (C)irculo: ");
			char tipo = Character.toUpperCase(sc.next().charAt(0));

			sc.nextLine();

			System.out.print("Cor (PRETO/AZUL/VERMELHO): ");
			Cor cor = Cor.valueOf(sc.nextLine().toUpperCase());

			switch (tipo) {
			case 'R':
				System.out.print("Altura: ");
				Double altura = sc.nextDouble();

				System.out.print("Largura: ");
				Double largura = sc.nextDouble();

				listForma.add(new Retangulo_131(cor, altura, largura));

				break;

			case 'C':

				System.out.print("Raio: ");
				Double raio = sc.nextDouble();

				listForma.add(new Circulo_131(cor, raio));

				break;

			default:
				System.out.println("Não existe esse tipo!");
				System.exit(0);
				break;
			}

		}

		System.out.println();
		System.out.println("Area das formas:");
		for (Forma_131 forma : listForma) {
			System.out.printf("%.2f \n", forma.area());
		}
	}

}
