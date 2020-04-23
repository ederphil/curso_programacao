package curso_programacao;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		int y = 32;
		double x = 10.35784;

		String nome = "Maria";
		int idade = 31;
		double renda = 4000.0;

		System.out.println("int: " + y);

		System.out.println("double: " + x);

		System.out.print("double formatado 2: ");
		System.out.printf("%.2f\n", x);

		System.out.print("double formatado 4: ");
		System.out.printf("%.4f\n", x);

		// Muda o local para formatar com .
		Locale.setDefault(Locale.US);

		System.out.print("double formatado 2 com ponto: ");
		System.out.printf("%.2f\n", x);

		System.out.print("double formatado 4 com ponto: ");
		System.out.printf("%.4f\n", x);

		System.out.println("-------------------------------------------");

		//Concatenando com printf
		System.out.printf("RESULTADO = %.2f metros\n", x);

		System.out.println("-------------------------------------------");

		System.out.println("Olá Mundo!!!");
		System.out.println("Bom dia!!!");

		System.out.print("Sem quebra de linha!!!");
		System.out.print(">>>>>>");
		System.out.println("/n");
		System.out.println("-------------------------------------------");
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
		
	}

}
