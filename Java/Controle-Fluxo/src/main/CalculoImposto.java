package main;

public class CalculoImposto {
	
	public double salario;
	
	public void calculoImposto() {
	if(salario < 1000) {
		double salarioLiquido = salario*0.95;
		System.out.println("Sal�rio com 5% de imposto: "+salarioLiquido);
		
	}else if(salario >= 1000 && salario < 2000) {
		double salarioLiquido = salario*0.90;
		System.out.println("Sal�rio com 10% de imposto: "+salarioLiquido);
	}else if(salario >= 2000 && salario < 5000) {
		double salarioLiquido = salario*0.85;
		System.out.println("Sal�rio com 15% de imposto: "+salarioLiquido);
	}else{
		double salarioLiquido = salario*0.80;
		System.out.println("20% de imposto: "+salarioLiquido);
	}
}
	
}
