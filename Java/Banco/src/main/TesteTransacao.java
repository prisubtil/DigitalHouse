package main;

public class TesteTransacao {

	public static void main(String[] args) {
		PagamentoBoleto pagtoBoleto = new PagamentoBoleto();
		
		pagtoBoleto.setDescricao("Condomínio");
		pagtoBoleto.setValor(450);
		pagtoBoleto.setData("26/08/2013");
		pagtoBoleto.setLinhaDigitavel("1234 1234 1234");
		pagtoBoleto.setDataVencimento("27/08/2013");
		pagtoBoleto.setCedente("Edifício da Praça Redonda");
		pagtoBoleto.emitirComprovante();
		
		Transferencia transferencia = new Transferencia();
		
		transferencia.setDescricao("Aluguel");
		transferencia.setValor(1500);
		transferencia.setData("10/08/2013");
		transferencia.setContaOrigem("0001000123");
		transferencia.setContaDestino("0001000965");
		transferencia.emitirComprovante();
	}

}
