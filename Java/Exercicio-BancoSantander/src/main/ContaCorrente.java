package main;

public class ContaCorrente extends Contas{
	
	private Cheque cheque;
	private double limiteChequeEspecial;
	
	public ContaCorrente() {
	super();	
	}
	
	public ContaCorrente(double saldo, double limiteChequeEspecial, Cheque cheque) {
		super(saldo);
		this.limiteChequeEspecial = limiteChequeEspecial;
		this.setCheque(cheque);
	}

	public double getLimiteChequeEspecial() {
		return limiteChequeEspecial;
	}

	public void setLimiteChequeEspecial(double limiteChequeEspecial) {
		this.limiteChequeEspecial = limiteChequeEspecial;
	}
	
	
	
	public void fazerDepositos(double valor){
		super.fazerDepositos(valor);
	}
	
	public void depositarCheques(Cheque cheque) {
		fazerDepositos(cheque.getValor());
	}
	
	@Override
	public void sacarDinheiro(double valor) {
		
		if(getSaldo()< valor) {
			limiteChequeEspecial = (getSaldo() - valor)*(-1);
			super.sacarDinheiro(valor);
			System.out.println("Saque realizado e foi utilizado R$"+limiteChequeEspecial+" do seu limite.");
		}else {
		
			super.sacarDinheiro(valor);
			System.out.println("Saque realizado.");
		
		}
		
	}

	@Override
	protected void depositar(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	@Override
	protected void sacar(double nextDouble) {
		// TODO Auto-generated method stub
		
	}

	public Cheque getCheque() {
		return cheque;
	}

	public void setCheque(Cheque cheque) {
		this.cheque = cheque;
	}
	
	

}
