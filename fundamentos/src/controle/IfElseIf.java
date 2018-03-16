package controle;

public class IfElseIf {

	public static void main(String[] args) {
		double nota = 6;

		if (nota >= 7) {
			System.out.println("Aprovado");
		} else if (nota < 7) {
			System.out.println("Recuperação");
		}

		if (nota >= 8) {
			System.out.println("Quadro de Honra");
		} else {
			System.out.println("Não foi maior ou igual a 8.");
		}

	}

}
