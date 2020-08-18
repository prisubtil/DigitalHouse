package main;

public class TesteClienteSemEnumeracao {
	public static void main(String[] args) {
		
		Cliente cliente = new Cliente();
		cliente.setStatus(Cliente.STATUS_ATIVO);
		System.out.println(cliente.getStatus());
		// isso deveria ser inválido, mas compila normalmente!
		
		cliente.setStatus(10);
		System.out.println(cliente.getStatus());
	}
}
