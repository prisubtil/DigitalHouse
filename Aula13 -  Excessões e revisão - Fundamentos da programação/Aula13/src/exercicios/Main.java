package exercicios;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		int op = 0;
		Scanner sc = new Scanner(System.in);
		
		do {			
			menu();
			op = sc.nextInt();
			
			switch(op) {
				case 1: somar();
						break;
				case 2: subtrair();
						break;
				case 3: multiplicar();
						break;
				case 4: dividir();
						break;
				case 5: System.out.println("OBRIGADO! VOLTE SEMPRE!");
						break;
				default: System.out.println("OPÇÃO INVÁLIDA");
			}
			
		}while(op != 5);


				}
	
			public static void somar() {
				Scanner sc = new Scanner(System.in);
				int  num1,num2;
				System.out.println("DIGITE UM NÚMERO: ");
		        num1 = sc.nextInt();
		        System.out.println("DIGITE UM NÚMERO: ");
		        num2 = sc.nextInt();
		        System.out.println("O RESULTADO DA OPERAÇÃO É: "+(num1+num2));
				
			}
			
			public static void subtrair() {
				Scanner sc = new Scanner(System.in);
				int  num1,num2;
			System.out.println("DIGITE UM NÚMERO: ");
	        num1 = sc.nextInt();
	        System.out.println("DIGITE UM NÚMERO: ");
	        num2 = sc.nextInt();
	        System.out.println("O RESULTADO DA OPERAÇÃO É: "+(num1-num2));
			}
			
			public static void multiplicar() {
				Scanner sc = new Scanner(System.in);
				int  num1,num2;
				System.out.println("DIGITE UM NÚMERO: ");
		        num1 = sc.nextInt();
		        System.out.println("DIGITE UM NÚMERO: ");
		        num2 = sc.nextInt();
		        System.out.println("O RESULTADO DA OPERAÇÃO É: "+(num1*num2));
				}
			
			public static void dividir() {
				Scanner sc = new Scanner(System.in);
				int  num1,num2;
				System.out.println("DIGITE UM NÚMERO: ");
		        num1 = sc.nextInt();
		        System.out.println("DIGITE UM NÚMERO: ");
		        num2 = sc.nextInt();
		        System.out.println("O RESULTADO DA OPERAÇÃO É: "+(num1/num2));
				}
			public static void menu() {
				System.out.println("ESCOLHA UMA OPÇÃO:");
				System.out.println("1 - SOMAR");
				System.out.println("2 - SUBTRAIR");
				System.out.println("3 - MULTIPLICAR");
				System.out.println("4 - DIVIDIR");
				System.out.println("5 - SAIR");
			}
		}
		
	


