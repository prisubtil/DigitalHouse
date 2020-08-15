package principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		//Circumference circ = new Circumference();
		//Volume vol = new Volume();
		
		System.out.println("What is the dollar price? : ");
		double dollarprice = sc.nextDouble();
		
		System.out.println("how many dollars do you want? : ");
		double manydollars = sc.nextDouble();
		
		System.out.println("you will spend R$ "+CurrencyConverter.currencyConverter(dollarprice, manydollars)+ " to buy these dollars.");
		
		
		//System.out.println("Circumference: "+circ.calcCircumference(radius));
		//System.out.println("Volume: "+ vol.calcVolume(radius));
		//System.out.printf("PI Value: " +Math.PI);
		
		sc.close();

	}

}
