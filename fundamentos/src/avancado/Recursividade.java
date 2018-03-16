package avancado;

public class Recursividade {

	public static void main(String[] args) {

		System.out.println(fatorialFor(3));
		// long estoura aproximadamente no 65
		// System.out.println(fatorial(65));
		System.out.println(fatorial(10));
	}

	private static int fatorialFor(int numero) {
		int fatorial = 1;

		for (int i = 1; i <= numero; i++) {
			fatorial = fatorial * i;
		}
		return fatorial;
	}

	// fatorial = 1 e i = 1 -> fatorial = 1 -> 1
	// fatorial = 1 e i = 2 -> fatorial = 2 -> 2
	// fatorial = 2 e i = 3 -> fatorial = 6 -> 3
	// fatorial = 6 e i = 4 -> fatorial = 24 -> 4
	// fatorial = 24 e i = 5 -> fatorial = 120 -> 5
	
	private static int fatorial(int numero) {
		
		// Dilui o metódo até chegar em 1, ai ele retorna 1 e vai retornando os outros de 2, de 3, e etc
		if (numero <= 1) {
			return 1;
		}

		return numero * fatorial(numero - 1);
	}

	// return 3 * (2 * (1 * (1))
	// return 4 * (3 * (2 * (1 * (1))))
	
}

