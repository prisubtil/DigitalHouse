
public class Usuario {
	private int totalUsuariosLogados;
	private String nome;
	
	public Usuario(String nome) {
	this.nome = nome;
	}
	
	public String getNome() {
	return nome;
	}
	
	public void logar() {
	this.totalUsuariosLogados++;
	}
	
	public void deslogar() {
	this.totalUsuariosLogados--;
	}
	
	public int getTotalUsuariosLogados() {
	return totalUsuariosLogados;
	}
}
