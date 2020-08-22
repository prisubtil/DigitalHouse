package principal;

public class Cachorro extends Mamifero{

	public Cachorro(String nome) {
		super(nome);
		
	}
	
	public Cachorro() {
		super();
	}
	@Override
	public void falar() {
		
		System.out.println("Latindo...");

}
}
