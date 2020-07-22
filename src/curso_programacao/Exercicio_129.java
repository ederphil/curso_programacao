package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ProdutoImportado_129;
import entities.ProdutoUsado_129;
import entities.Produto_129;

public class Exercicio_129 {

	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		System.out.print("Informe o número de produtos: ");
		int nroProdutos = sc.nextInt();

		List<Produto_129> listProd = new ArrayList<Produto_129>();

		for (int i = 1; i <= nroProdutos; i++) {

			System.out.println("------------------------------------------------");
			System.out.println("Dados do produto #" + i);

			System.out.print("(C)omum, (u)sado ou (i)mportado: ");
			char tipo = Character.toUpperCase(sc.next().charAt(0));
			
			if (tipo != 'I' && tipo != 'C' && tipo != 'U') {
				System.out.println();
				System.out.println("------------------------");
				System.out.println("Não existe essa opção.");
				System.out.println("------------------------");
				System.exit(0);
			}
			
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("Preço: ");
			Double preco = sc.nextDouble();

			if (tipo == 'I') {
				System.out.print("Custo de Importação: ");
				Double custosImportacao = sc.nextDouble();
				listProd.add(new ProdutoImportado_129(nome, preco, custosImportacao));
			} else if (tipo == 'C') {
				listProd.add(new Produto_129(nome, preco));
			} else if (tipo == 'U') {
				System.out.print("Data Manutenção (DD/MM/AAAA): ");
				sc.nextLine();
				String dataTeste = sc.nextLine();
				Date dataManutencao = sdf.parse(dataTeste);
				listProd.add(new ProdutoUsado_129(nome, preco, dataManutencao));
			} 

		}

		System.out.println();
		System.out.println("ETIQUETA PREÇO: ");

		for (Produto_129 prod : listProd) {
			System.out.println(prod.etiquetaPreco());
		}

		sc.close();

	}

}
