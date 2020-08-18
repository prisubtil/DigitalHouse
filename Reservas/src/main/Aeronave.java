package main;

public class Aeronave {
	int totalAssentos;
	int assentosReservados;
	
	public void reservarAssentos(int numeroAssentos) {
	assentosReservados += numeroAssentos;
	}
	
	public int calcularAssentosDisponiveis() {
	return totalAssentos - assentosReservados;
	}
	
	
}
