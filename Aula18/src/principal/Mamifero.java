package principal;

public class Mamifero extends Animal{

	public Mamifero(String nome) {
		super(nome);
		
	}
	
	public Mamifero(){
		super();
	}
	
	@Override
	public void falar() {
		super.falar();
		System.out.println("e mamando...");
		
	}

}
