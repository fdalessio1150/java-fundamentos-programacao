package colecoes;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class ConjuntoComportado {

	public static void main(String[] args) {

		// Nao segue a ordem de insercao
		// Set<String> aprovados = new HashSet<String>();

		// Segue a ordem de insercao
		// Set<String> aprovados = new LinkedHashSet<String>();

		// No caso a string segue a ordem alfabetica
		Set<String> aprovados = new TreeSet<String>();
		aprovados.add("Joao");
		aprovados.add("Pedro");
		aprovados.add("Maria");
		aprovados.add("Rafael");

		for (Object nome : aprovados) {
			System.out.println(nome);
		}

	}
}
