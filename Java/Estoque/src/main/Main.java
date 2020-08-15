package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Produto x = new Produto();
		
		System.out.println("Digite os dados do produto ");
		System.out.print("Nome: ");
		x.nome = sc.nextLine();
		System.out.print("Pre�o: ");
		x.preco = sc.nextDouble();
		System.out.print("Quantidade: ");
		x.quantidade = sc.nextInt();
		
		System.out.println("Nome: "+x.nome+", R$"+x.preco+", "+x.quantidade+" unidades, Total: R$ "+x.valorTotalEmEstoque());
		
		System.out.print("Digite a quantidade a ser adicionada no estoque: ");
		int quantidade = sc.nextInt();
		x.adicionarProduto(quantidade);
		
		System.out.println("Nome: "+x.nome+", R$"+x.preco+", "+x.quantidade+" unidades, Total: R$ "+x.valorTotalEmEstoque());
		
		System.out.print("Digite a quantidade a ser removida do estoque: ");
		 quantidade = sc.nextInt();
		x.removerProduto(quantidade);;
		
		System.out.println("Nome: "+x.nome+", R$"+x.preco+", "+x.quantidade+" unidades, Total: R$ "+x.valorTotalEmEstoque());
		
		sc.close();
	}

}