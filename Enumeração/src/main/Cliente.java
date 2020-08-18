package main;

public class Cliente {
	
	public static final int STATUS_ATIVO = 0;
	public static final int STATUS_EM_ANALISE = 1;
	public static final int STATUS_CANCELADO = 2;
	public static final int STATUS_BLOQUEADO = 3;
	private int status;
	
	public int getStatus() {
	return this.status;
	}
	
	public void setStatus(int status) {
	this.status = status;
	}
}
