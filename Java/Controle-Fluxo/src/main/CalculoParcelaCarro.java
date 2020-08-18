package main;

public class CalculoParcelaCarro {

	public static void main(String[] args) {
		 
		double valorTotal = 30000;
		
		
		for(int parcela = 1; parcela <= valorTotal; parcela++) {
			double valorParcela = valorTotal/parcela;
			
			if(valorParcela <= 1000) {
				
				continue;
			
			}
			
			
			System.out.println(parcela+" Parcela = R$ "+ valorParcela);
		}
		

	}

}
