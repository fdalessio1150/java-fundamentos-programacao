package classe;

public class Funcionario {

	String nome;
	double salario;
	String funcao;
	
	Funcionario() {
		
	}
	
	Funcionario(String n, double s, String f) {
		nome = n;
		salario = s;
		funcao = f;		
	}
	
	String formatar() {
		return String.format("%s, %.2f, %s", nome, salario, funcao);
	}
}
