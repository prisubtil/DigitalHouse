package main;

public class CalculoImc {
	public String nome;
	public double peso;
	public double altura;
	public double imc;
	
	public void calculoImc() {
		
		imc = peso / (altura * altura);
		
		if (imc < 18.5) {
			System.out.println(nome+" esta abaixo do peso ideal.");
		}else if (imc < 25) {
			System.out.println(nome+" esta com o peso ideal.");
		}else if (imc < 30) {
			System.out.println(nome+" está acima do peso.");
		}else if (imc < 35) {
			System.out.println(nome+" está com obesidade grau I.");
		}else if (imc < 40) {
			System.out.println(nome+" está com obesidade grau II.");
		}else {
			System.out.println(nome+" está com obesidade grau III.");
			System.out.println("Muito cuidado com seu peso.");
			}
		
	}
	
	

}
