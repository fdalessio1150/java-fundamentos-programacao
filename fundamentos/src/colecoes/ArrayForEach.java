package colecoes;

public class ArrayForEach {

	public static void main(String[] args) {
		
		double[] notasJoao = {8.6, 8.7, 6.9, 10.0, 9.5};
		
		double[] notasPedro = new double[5];
		notasPedro[0] = 7.0;
		notasPedro[1] = 2.0;
		notasPedro[2] = 3.0;
		notasPedro[3] = 10.0;
		notasPedro[4] = 10.0;
		
		double totalJoao = 0;
		for(double nota: notasJoao) {
			totalJoao += nota;
		}
//		for (int i = 0; i < notasJoao.length; i++) {
//			//System.out.println(notasJoao[i]);
//			totalJoao += notasJoao[i];	
//		}

		double totalPedro = 0;
		for(double nota: notasPedro) {
			totalPedro += nota;
		}
//		for (int i = 0; i < notasPedro.length; i++) {
//			//System.out.println(notasPedro[i]);
//			totalPedro += notasPedro[i];		
//		}
		
		System.out.println(totalJoao / notasJoao.length);
		System.out.println(totalPedro / notasPedro.length);
	}

}
