package colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {
		// Stack<String> pilha = new Stack<String>();
		Deque<String> pilha = new ArrayDeque<String>();
		
		pilha.push("O Pequeno Príncipe");
		pilha.push("O Hobbit");
		pilha.push("Don Quixote");

		System.out.println("Peek...");
		System.out.println(pilha.peek());

		System.out.println(pilha.pop());
		System.out.println(pilha.pop());
		//System.out.println(pilha.pop());
		// System.out.println(pilha.pop());

	}

}
