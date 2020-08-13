package empregado;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
Scanner sc = new Scanner(System.in);
		
		Empregado emp = new Empregado();
		
		System.out.println("Digite os dados do empregado:");
		System.out.print("Nome: ");
		emp.nome = sc.nextLine();
		System.out.print("Salário Bruto: ");
		emp.salarioBruto = sc.nextDouble();
		System.out.print("Taxa: ");
		emp.taxa = sc.nextDouble();
		System.out.println();
		
		System.out.println("Empregado: "+emp.nome+", R$ "+emp.salarioLiquido());
		
		System.out.print("Qual o percentual de aumento salarial: ");
		double porc = sc.nextDouble();
		emp.aumentarSalario(porc);
		
		System.out.println("Empregado: "+emp.nome+", R$ "+emp.salarioBruto);
		
		
		sc.close();
	}

}
