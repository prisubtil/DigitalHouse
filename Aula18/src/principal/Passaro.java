package principal;

public class Passaro extends Animal{

	public Passaro(String nome) {
		super(nome);
		
	}
	
	public Passaro() {
		super();
	}
	
	
	@Override
	public void falar() {
		super.falar();
		System.out.println("Piando...");
	
}
}
