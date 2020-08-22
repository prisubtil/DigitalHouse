package principal;

public class Vaca extends Mamifero{

	public Vaca(String nome) {
		super(nome);
		
	}
	
	public Vaca() {
		super();
	}
	
	@Override
	public void falar() {
		super.falar();
		System.out.println("Mugindo...");
}
}
