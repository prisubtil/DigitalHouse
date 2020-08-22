package principal;

import java.util.ArrayList;
import java.util.List;

public class Principal {
	public static void main(String[] args) {
		
		Animal a1 = new Animal();
		Mamifero m = new Mamifero();
		Passaro p = new Passaro();
		Animal a2 = new Animal();
		Animal a3 = new Mamifero();
		Animal a4 = new Passaro();
		Cachorro c = new Cachorro();
		
		List<Animal> lista = new ArrayList<>();
		
		lista.add(a2);
		lista.add(a3);
		lista.add(a4);
		
		for(Animal a : lista) {
			if( a instanceof Mamifero) {
				System.out.println("Mamifero");
			}
			if( a instanceof Passaro) {
				System.out.println("Pássaro");
			}
		}
		
		//m.falar();
		c.falar();
		
		
	}
}
