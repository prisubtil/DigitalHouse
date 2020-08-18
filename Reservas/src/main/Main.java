package main;

public class Main {
	public static void main(String[] args) {
		
		Aeronave aviaoGol = new Aeronave();
		aviaoGol.totalAssentos = 100;
		
		Aeronave aviaoTam = new Aeronave();
		aviaoTam.totalAssentos = 130;
		
		
		aviaoGol.reservarAssentos(10);
		aviaoTam.reservarAssentos(5);
		
		int assentosGol = aviaoGol.calcularAssentosDisponiveis();
		int assentosTam = aviaoTam.calcularAssentosDisponiveis();
			
		System.out.println("Assentos disponíveis - Gol: " + assentosGol);
		System.out.println("Assentos disponíveis - TAM: " + assentosTam);
	}
}
