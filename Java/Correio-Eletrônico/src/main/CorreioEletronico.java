package main;

public class CorreioEletronico {
	
	public void enviarEmails(String[] emails) {
		
		// percorre todos os emails recebidos como par�metro
		
		for (String email : emails) {
			
		// envia e-mail
		System.out.println("E-mail enviado para " + email);
		
		}
	}
}
