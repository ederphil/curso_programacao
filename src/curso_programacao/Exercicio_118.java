package curso_programacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Cliente;
import entities.Pedido;
import entities.PedidoItem;
import entities.Produto;
import entities.enums.OrderStatus;

public class Exercicio_118 {

	public static void main(String[] args) throws ParseException {
		
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Nascimento (DD/MM/YYYY): ");
		Date dataNascimento = sdf.parse(sc.nextLine());
		
		System.out.println("Entre com os dados do pedido: ");
		
		System.out.print("Status: ");
		String status = sc.nextLine();
		
		Pedido pedido = new Pedido(new Date(), OrderStatus.valueOf(status),new Cliente(nome, email, dataNascimento));
				
		System.out.print("Quantos itens para este pedido: ");
		int qtdItemPedido = sc.nextInt();
		
		for (int i = 1; i <= qtdItemPedido; i++) {
			System.out.println();
			sc.nextLine(); 
			System.out.println("Entre com os dados o item #"+i+": ");
			System.out.print("Nome: ");
			String nomeProduto = sc.nextLine();
			System.out.print("Preço: ");
			Double precoProduto = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			Produto produto = new Produto(nomeProduto, precoProduto);
			PedidoItem pedidoItem = new PedidoItem(quantidade, precoProduto, produto);
			pedido.addItem(pedidoItem);
		}
		System.out.println();
		System.out.println(pedido);
		sc.close();
		
	}

}
