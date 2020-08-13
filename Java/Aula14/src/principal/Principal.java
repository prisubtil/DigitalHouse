package principal;

import java.util.Scanner;

import geometria.Triangulo;

public class Principal {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		Triangulo y = new Triangulo();
		
		
		System.out.println("Digite os tr�s lados do tri�ngulo X: ");
		x.ladoA = sc.nextDouble();
		x.ladoB = sc.nextDouble();
		x.ladoC = sc.nextDouble();
		
		System.out.println("Digite os tr�s lados do tri�ngulo Y: ");
		y.ladoA = sc.nextDouble();
		y.ladoB = sc.nextDouble();
		y.ladoC = sc.nextDouble();
		
		double xArea = x.calcularArea();
		double yArea = y.calcularArea();
		
		System.out.println("Aa �rea do tri�ngulo X �: " + xArea);
		System.out.println("Aa �rea do tri�ngulo Y �: " + yArea);
		
		if(xArea > yArea) {
			System.out.println("A �rea do tri�ngulo X � maior.");
		}else {
			System.out.println("A �rea do tri�ngulo Y � maior.");
		}
		
		sc.close();

	}

}
