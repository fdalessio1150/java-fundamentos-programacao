package classe;

public class FuncionarioTeste {

	public static void main(String[] args) {

		Funcionario func1 = new Funcionario();
		
		func1.nome = "Felipe D'Alessio";
		func1.salario = 9999.9f;
		func1.funcao = "Engenheiro de Dados";
		
		Funcionario func2 = new Funcionario("Homem Aranha", 8500.4288, "Herói");
		
		
		
		System.out.println(func1.formatar());
		System.out.println(func2.formatar());

		

	}

}
