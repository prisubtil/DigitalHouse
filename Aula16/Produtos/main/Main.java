package main;

import produtos.Produto;

public class Main {

	public static void main(String[] args) {
		
		Produto tv = new Produto("TV", 900.00, 10);
		Produto microondas = new Produto("Microondas", 200.00, 100);
		
		System.out.println(tv.getNome());
		tv.setNome("Televisão");
		System.out.println(microondas.getNome());
	}

}
