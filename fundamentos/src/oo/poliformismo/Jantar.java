package oo.poliformismo;

public class Jantar {

	public static void main(String[] args) {
		Arroz arroz = new Arroz();
		arroz.setPeso(0.250);
		
		Feijao feijao = new Feijao();
		feijao.setPeso(0.250);
		
		Sorvete sorvete = new Sorvete();
		sorvete.setPeso(0.250);
		
		Pessoa pessoa = new Pessoa(80.0);
		pessoa.comer(arroz);
		pessoa.comer(feijao);
		pessoa.comer(sorvete);
		
		Pessoa pessoa2 = new Pessoa(75.0);
		pessoa2.comer(arroz, feijao, sorvete, feijao, feijao, feijao, feijao);
		
		System.out.println(sorvete.getPeso());
		System.out.println(arroz.getPeso());
		System.out.println(feijao.getPeso());
		System.out.println(pessoa.getPeso());
		
		System.out.println(pessoa2.getPeso());
	}
}
