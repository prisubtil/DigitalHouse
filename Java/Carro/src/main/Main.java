package main;

public class Main {

	public static void main(String[] args) {
		Proprietario dono1 = new Proprietario();
		dono1.nome = "Jo�o da Silva";
		dono1.cpf = "000.000.000-00";
		dono1.idade = 25;
		dono1.logradouro = "Rua Jo�o Pinheiro, 10";
		dono1.bairro = "Centro";
		dono1.cidade = "Uberl�ndia";
		
		Carro meuCarro = new Carro();
		meuCarro.anoDeFabricacao = 2011;
		meuCarro.cor = "Prata";
		meuCarro.fabricante = "Fiat";
		meuCarro.modelo = "Palio";
		meuCarro.tipoCombustivel = "Bicombust�vel";
		meuCarro.valorDeMercado = 30000;
		meuCarro.dono = dono1;
		
		meuCarro.ligar();
	}

}
