package curso_programacao;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio_24 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		String x;
		int a;
		double b;

		System.out.print("Informe o nome: ");
		x = sc.next();

		System.out.print("Informe a idade: ");
		a = sc.nextInt();

		System.out.print("Informe o s�lario: ");
		b = sc.nextDouble();

		System.out.println("Voc� digitou String: " + x);
		System.out.println("Voc� digitou Int: " + a);
		System.out.printf("Voc� digitou Double: %.2f \n", b);

		sc.close();

	}

}
