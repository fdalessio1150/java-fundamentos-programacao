package api;

public class ExplorandoString {

	public static void main(String[] args) {
		String nome = "Felipe " + "D'Alessio";
		
		// Alguns m�todos
		System.out.println(nome.toUpperCase());
		System.out.println(nome.toLowerCase());

		System.out.println(nome.length());
		System.out.println(nome.substring(0, 6));
		System.out.println(nome.indexOf('l'));
		System.out.println(nome.charAt(7));
		System.out.println(nome.equalsIgnoreCase("felipe d'alessio"));
		System.out.println(nome.startsWith("Fel"));
		System.out.println(nome.isEmpty());
		System.out.println(nome.concat(" � legal").concat("!"));
		
		// A string � imut�vel;
		System.out.println(nome);
		
		nome = nome.toUpperCase().substring(0, 6).concat(" � legal!");
		System.out.println(nome);
		
	}
}
