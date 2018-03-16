package classe;

public class ValorVsReferencia {
	
	static void porValor(double numero) {
		numero++;
	}

	static void porReferencia(Produto produto) {
		produto.preco++;
	}
	
	public static void main(String[] args) {
		double numero = 1;
		// Referencia para a instãncia é a final, porém os atributos podem mudar
		// final Produto prod1 = new Produto("Caneta", 1);
		
		// 2 objetos apontando para 1 instância
		Produto prod1 = new Produto("Caneta", 1);
		Produto prod2 = prod1;
		
		// O atributo da instância foi alterada, portanto os 2 objetos retornam a mesma coisa
		prod2.nome = "Lapis";
		
		// Agora foi criado 1 nova instância e os 2 objetos apontam para essa nova instância
		// Nesse ponto a primeira instância está alocada em memória mas não tem um objeto apontando para ele e portanto não é possível acessar o seus valores
		prod1 = new Produto();
		prod2 = prod1;
		
		porValor(numero);
		porReferencia(prod1);
		
		System.out.println(numero);
		System.out.println(prod1.preco);
		System.out.println(prod1.nome);
		System.out.println(prod2.nome);
	}
}
