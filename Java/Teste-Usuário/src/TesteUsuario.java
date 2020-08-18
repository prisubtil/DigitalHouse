
public class TesteUsuario {
	public static void main(String[] args) {
		
		Usuario usuario1 = new Usuario("joao");
		Usuario usuario2 = new Usuario("sebastiao");
		
		usuario1.logar();
		usuario2.logar();
		
		System.out.println(usuario1.getTotalUsuariosLogados());
		System.out.println(usuario2.getTotalUsuariosLogados());

		}
}
