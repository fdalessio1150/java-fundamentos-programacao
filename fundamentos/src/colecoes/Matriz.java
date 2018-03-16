package colecoes;

public class Matriz {

	public static void main(String[] args) {
		double[][] notasJoao = {{7.7, 7.8}, {10.0, 6.0}};
		double[][] notasPedro = new double[2][];
		
		notasPedro[0] = new double[2];
		notasPedro[1] = new double[2];
		
		notasPedro[0][0] = 8.7;
		notasPedro[0][1] = 4.6;
		notasPedro[1][0] = 9.7;
		notasPedro[1][1] = 7.2;
		
		double totalJoao = 0;
		double totalPedro = 0;
		int qtdeNotasJoao = 0;
		int qtdeNotasPedro = 0;
		
		for(int i = 0; i < notasJoao.length; i++) {
			for(int j = 0; j < notasJoao.length; j++) {
				totalJoao += notasJoao[i][j];
				qtdeNotasJoao++;
				System.out.println(notasJoao[i][j]);
			}
				
		}
		
		for(double[] notasParciais: notasPedro) {
			for(double nota: notasParciais) {
				totalPedro += nota;
				qtdeNotasPedro++;
				System.out.println(nota);	
			}
		}
		
		System.out.println(totalJoao / qtdeNotasJoao);
		System.out.println(totalPedro / qtdeNotasPedro);
	}
}
