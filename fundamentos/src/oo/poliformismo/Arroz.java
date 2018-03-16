package oo.poliformismo;

public class Arroz extends Comida {
	
	public void setPeso(double peso) {
		if (peso > 0) {
			super.setPeso(peso + 0.1);
		}
	}
}
