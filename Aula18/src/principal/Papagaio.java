package principal;

public class Papagaio extends Passaro{

	public Papagaio(String nome) {
		super(nome);
		
	}
	
	public Papagaio() {
		super();
	}
	

	@Override
	public void falar() {
		super.falar();
		System.out.println("Repetindo...");

}
}
