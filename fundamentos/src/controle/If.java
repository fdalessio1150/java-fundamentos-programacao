package controle;

public class If {

	public static void main(String[] args) {
		double nota = 9.5;
		boolean bomComportamento = false;

		if (nota >= 9 && bomComportamento) {
			System.out.println("Quadro de honra!");
		} else if (nota >= 9) {
			System.out.println("Quase quadro de honra!");
		} 

	}
}