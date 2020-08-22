package principal;

public class Animal implements Bicho{
	private String nome;
	
	public Animal(String nome) {
		this.nome = nome;
	}
	
	
	public Animal() {
		
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void falar() {
		
		System.out.println("Falando...");
	}


	@Override
	public void correr() {
		// TODO Auto-generated method stub
		
	}


	@Override
	public Double litrosDeAgua() {
		// TODO Auto-generated method stub
		return null;
	}
}
