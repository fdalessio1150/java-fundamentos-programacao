package classe;

public class DataTeste {

	public static void main(String[] args) {
		Data nascimento = new Data();
		Data casamento = new Data(8, 9, 2010);
		
		nascimento.dia = 19;
		nascimento.mes = 11;
		nascimento.ano = 1987;
		
		
		//System.out.println(nascimento.dia + "/" + nascimento.mes + "/" + nascimento.ano);
		//System.out.printf("%d/%d/%d", nascimento.dia, nascimento.mes, nascimento.ano);
		
		System.out.println(nascimento.formatar());
		System.out.println(casamento.formatar());
	}

}
