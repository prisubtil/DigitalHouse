package main;

public class FolhaPagamento {
	

	public double calcularSalario(int horasNormais, int horasExtras,
			double valorHoraNormal, double valorHoraExtra) {
			
		// c�lculo do sal�rio
		
			double valorHorasNormais = horasNormais * valorHoraNormal;
			double valorHorasExtras = horasExtras * valorHoraExtra;
			return valorHorasNormais + valorHorasExtras;
			
	}

}
