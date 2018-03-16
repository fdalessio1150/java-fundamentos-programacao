package classe;

public class VariaveisLocais {

	int a = 5;
	int a1 = 3;
	
	void teste1() {
		System.out.println(a);
		// System.out.println(a1);

		// int a1 = 2;

		// Está no escopo do IF, ou seja está visivel apenas dentro do IF
		 if (a1 > 3) {
			 int a2 = 3;
			 System.out.println(a2);
			 
		 }

		// System.out.println(a2);

	}
	
	int teste2() {
		int a1 = 2;
		this.a1 = a1;
		return this.a1;
	}
	
	

	public static void main(String[] args) {
		VariaveisLocais a = new VariaveisLocais();
		
		System.out.println(a.teste2());
	}

}
