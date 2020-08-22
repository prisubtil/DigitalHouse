package principal;

public class BemTeVi extends Passaro{

	public BemTeVi(String nome) {
		super(nome);
		
	}
	
	public BemTeVi() {
		super();
	}
	
	@Override
	public void falar() {
		super.falar();
		System.out.println("Cantando...");
	}

}
