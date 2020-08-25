package main;

import java.sql.Date;

public class Cheque {
	private Double valor;
	private String bancoEmissor;
	private Date dataPagamento;
	
	public Cheque(double valor, Date dataPagamento, String bancoEmissor) {
		this.valor = valor;
		this.bancoEmissor = bancoEmissor;
		this.dataPagamento = dataPagamento;
	}
	
	public Cheque(double valor2, String nextLine, java.util.Date parse) {
		
	}

	public double getValor() {
		return valor;
	}
	public void setValor(double valor) {
		this.valor = valor;
	}
	public String getBancoEmissor() {
		return bancoEmissor;
	}
	public void setBancoEmissor(String bancoEmissor) {
		this.bancoEmissor = bancoEmissor;
	}
	public Date getDataPagamento() {
		return dataPagamento;
	}
	public void setDataPagamento(Date dataPagamento) {
		this.dataPagamento = dataPagamento;
	}
	
	
}
