package main;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		
		List<Integer> lista = new ArrayList<>();
		
		lista.add(1);
		lista.add(2);
		lista.add(3);
		lista.add(4);
		lista.add(5);
		
		for(int i=0; i < lista.size(); i++) {
			System.out.println(lista.get(i));
		}
		
		
		
	}

}
