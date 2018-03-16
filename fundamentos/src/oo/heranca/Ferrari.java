package oo.heranca;

public class Ferrari extends Carro{
	
	public Ferrari() {
		VELOCIDADE_MAXIMA = 350;
	}
	
	
	public void acelerar() {
		// super indica que está acessando método da classe pai
		// Neste caso nao precisaria pois o método acelerarMais só existe na classe Carro.
		super.acelerarMais(20);
	}

}
