package main;

public class Arrays2 {

	public static void main(String[] args) {
		// byte , short , int , long, float , double = 0
		// char = '\u0000' ' '
		// boolean = false 
		//reference = null;
		
		/*int[] idade = new int[3];
		
		System.out.println("Idade: 1: "+idade[0]);
		System.out.println("Idade: 1: "+idade[1]);
		System.out.println("Idade: 1: "+idade[2]);
*/
		
		String [] nome = new String[4];
		nome[0] = "Naruto";
		nome[1] = "Goku";
		nome[2] = "Luffy";
		nome[3] = "Kurosaki";
		
		System.out.println("Este array tem "+nome.length+" posições.");
		
		for(int i = 0; i<nome.length; i++) {
			System.out.println(nome[i]);
		}
	}

}
