package main;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args, Object conta) throws ParseException {
		
		Random random = new Random();
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		String typeAccount = sc.next().toLowerCase();
		sc.nextLine();
		double saldoInicial = sc.nextDouble();
		
		if(typeAccount.charAt(0) == 'p') {
			conta = new ContaPoupanca(saldoInicial,0.05);
		}else {
			conta = new ContaCorrente();
		}
		
		sc.nextLine();
		System.out.print("Digite o valor do depósito: ");
		((Contas) conta).depositar(sc.nextDouble());
		sc.nextLine();
		if (conta instanceof ContaCorrente) {
			double valor = sc.nextDouble();
			sc.nextLine();
			((ContaCorrente) conta)
					.depositarCheques( new Cheque( valor, sc.nextLine(), sdf.parse(sc.nextLine())));
		}
		((Contas) conta).sacar(sc.nextDouble());
		System.out.println(conta);
		
		
		sc.close();
	}
}
