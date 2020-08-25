package main;

public class ContaPoupanca extends Contas {
	private Double taxa;
	
	public ContaPoupanca() {
		super();
	}
	
	public ContaPoupanca(double taxa, double saldo) {
		super(saldo);
		this.taxa = taxa;
	}
	
	public ContaPoupanca(double taxa) {
		this.taxa = taxa;
	}
	
	
	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	@Override
	public void sacarDinheiro(double valor) {
		
		if(getSaldo() > valor) {
			System.out.print("Saque realizado. Saldo disponível: ");
			super.sacarDinheiro(valor);
		}
		else {
		System.out.println("Saldo insuficiente. Saldo disponível: ");
		}
		
	}
	
	public void fazerDepositos(double valor){
		super.fazerDepositos(valor);
	}
	
	public void recolherJuros() {
		fazerDepositos( getSaldo()*taxa);
	}

	@Override
	protected void depositar(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void sacar(double nextDouble) {
		// TODO Auto-generated method stub
		
	}
}
