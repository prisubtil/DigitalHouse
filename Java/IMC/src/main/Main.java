package main;

import java.util.Scanner;



public class Main {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		CalculoImc calc = new CalculoImc();
	
		System.out.print("Nome: ");
		calc.nome = entrada.nextLine();
		System.out.print("Peso: ");
		calc.peso = entrada.nextInt();
		System.out.print("Altura: ");
		calc.altura = entrada.nextDouble();
		
		calc.calculoImc();
	
		
		entrada.close();
		}

	}


