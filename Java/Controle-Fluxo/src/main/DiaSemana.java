package main;

public class DiaSemana {

	public static void main(String[] args) {
		
		byte dia = 5;
				
			switch(dia) {
				case 1: 
					System.out.println("Domingo");
					break;
				case 2:
					System.out.println("Segunda");
					break;
				case 3:
					System.out.println("Ter�a");
					break;
				case 4:
					System.out.println("Quarta");
					break;
				case 5:
					System.out.println("Quinta");
					break;
				case 6:
					System.out.println("Sexta");
					break;
				case 7:
					System.out.println("S�bado");
				default:
					System.out.println("Op��o inv�lida");
			
				}
			
			String sexo = "F";
			
			switch(sexo) {
			case "F":
				System.out.println("Feminino");
				break;
			case "M":
				System.out.println("Masculino");
				break;
			default:
				System.out.println("op�o inv�lida");
			}
		
	

	}

}
