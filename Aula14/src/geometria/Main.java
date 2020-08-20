package geometria;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		Retangulo ret = new Retangulo(); 
		
		System.out.println("Digite a base e a altura do ret�ngulo: ");
		ret.altura = sc.nextDouble();
		ret.base = sc.nextDouble();
		
		System.out.println("AREA: "+ret.calculoArea());
		System.out.println("PER�METRO: "+ret.calculoPerimetro());
		System.out.println("DIAGONAL: "+ret.calculoDiagonal());
		
		sc.close();
	}

}
