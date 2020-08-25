package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import lanchonete.Sanduiche;


public class Main {
//	No programa principal o usu�rio deve receber um menu podendo
//	escolher entre as op��es [1] sandu�ches, [2] massas, [3] bolos.
//	Ap�s fazer a sele��o cada op��o deve levar para um submenu para
//	escolher os ingredientes do lanche selecionado.
//	e ao final o menu deve perguntar qual a sua dist�ncia do
//	restaurante, calcular o pre�o e o tempo de chegada do lanche at� a sua casa.
	
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int op = 0;
		do {
			System.out.println("Escolha uma op��o:");
			System.out.println("[1] Sandu�ches\n[2] Massas\n[3] Bolos\n[4] Sair");
			op = sc.nextInt();
			switch(op) {
				case 1: menuSanduiche();
					break;
				case 2:
					break;
				case 3:
					break;
				case 4:
					break;
				default:
			}
		}while(op != 4);
		
	}
		private static void menuSanduiche() {
			Scanner sc = new Scanner(System.in);
			List<String> ingredientes = new ArrayList<>();
			
			while(ingredientes.size() <= 10) {
				System.out.print("Digite um ingrediente: ");
				ingredientes.add( sc.nextLine() );
				System.out.println("Deseja adicionar outro ingrediente? (s/n)");
				char c = sc.next().charAt(0);
				sc.nextLine();
				if(c == 'n') {
					break;
				}				
			}
			
			Sanduiche sanduiche = new Sanduiche(12.00, ingredientes);
			
			System.out.println("Quantos km de dist�ncia da sua casa at� a lanchonete?");
			double distancia = sc.nextDouble();
			
			System.out.println("Pre�o: "+sanduiche.getPreco()+" Tempo para entrega: "+sanduiche.tempo(distancia)+" minutos");
		}		
	
}
