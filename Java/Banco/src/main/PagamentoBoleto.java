package main;

public class PagamentoBoleto extends Transacao {
	private String descricao;
	private double valor;
	private String data;
	private String linhaDigitavel;
	private String dataVencimento;
	private String cedente;
	
	
	
	public String getDescricao() {
		return descricao;
	}



	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}



	public double getValor() {
		return valor;
	}



	public void setValor(double valor) {
		this.valor = valor;
	}



	public String getData() {
		return data;
	}



	public void setData(String data) {
		this.data = data;
	}



	public String getLinhaDigitavel() {
		return linhaDigitavel;
	}



	public void setLinhaDigitavel(String linhaDigitavel) {
		this.linhaDigitavel = linhaDigitavel;
	}



	public String getDataVencimento() {
		return dataVencimento;
	}



	public void setDataVencimento(String dataVencimento) {
		this.dataVencimento = dataVencimento;
	}



	public String getCedente() {
		return cedente;
	}



	public void setCedente(String cedente) {
		this.cedente = cedente;
	}



	public void emitirComprovante() {
	System.out.println("Comprovante da transação");
	System.out.println("========================");
	System.out.println("Descrição: " + this.getDescricao());
	System.out.println("Data: " + this.getData());
	System.out.println("Valor: " + this.getValor());
	System.out.println("Linha digitável: "+ this.getLinhaDigitavel());
	System.out.println("Data de vencimento: " + this.getDataVencimento());
	System.out.println("Cedente: " + this.getCedente());
	System.out.println();
}
}
