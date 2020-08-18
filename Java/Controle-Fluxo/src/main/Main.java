package main;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	
		Scanner sc = new Scanner(System.in);
		
		CalculoImposto calc = new CalculoImposto();
		
		System.out.println("Digite o seu salário: ");
		calc.salario = sc.nextDouble();
		
		calc.calculoImposto();
		
			
		sc.close();
		
		
		}
		
	}

