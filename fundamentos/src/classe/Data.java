package classe;

public class Data {
	
	int dia;
	int mes;
	int ano;
	
	
	// Construtor padrão, sem parâmetro de entrada
	Data() {
		
	}
	
	// Construtor que recebe parâmetros
	Data(int dia, int mes, int ano) {
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	String formatar() {
		return String.format("%d/%d/%d", dia, mes, ano);
	}
	

}
