package oo.poliformismo;

public class Pessoa {

	/**
	 * Peso em Kg
	 */
	private double peso = 0;

	public Pessoa(double pesoInicial) {
		this.peso = pesoInicial;
	}

	public double getPeso() {
		return peso;
	}

	// Polimofirsmo est�tico, toda vez que criar uma nova comida precisa adicionar
	// um m�todo para receber esse novo objeto
	// public void comer(Arroz arroz) {
	// this.peso += arroz.getPeso();
	// }

	// public void comer(Feijao feijao) {
	// this.peso += feijao.getPeso();
	// }

	// public void comer(Sorvete sorvete) {
	// this.peso += sorvete.getPeso();
	// }

	// Polimofirsmo din�mico � utilizado a partir da heran�a, comida � generico
	// Gen�rcio -> Comida
	// -> Arroz
	// -> Feijao
	// -> Sorvete
	// Portanto se a pessoa sabe comer o que � mais gen�rico
	public void comer(Comida comida) {
		this.peso += comida.getPeso();
	}

	public void comer(Comida... comidas) {
		for (Comida c : comidas) {
			this.peso += c.getPeso();
		}

	}

}
