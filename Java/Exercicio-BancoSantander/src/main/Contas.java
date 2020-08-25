package main;

public abstract class Contas {
	
	private Double saldo;
	
	public Contas() {
		
	}
	
	public Contas(double saldo) {
		this.saldo = saldo;
	}
	
	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void fazerDepositos(double valor){
		saldo += valor;
	}
	
	public void sacarDinheiro(double valor) {
		saldo -= valor;
	}

	protected abstract void depositar(double nextDouble);

	protected abstract void sacar(double nextDouble);
	
	
	
	
}
