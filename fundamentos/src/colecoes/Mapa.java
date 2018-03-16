package colecoes;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Mapa {

	public static void main(String[] args) {
		Map<Integer, String> aprovados = new HashMap<Integer, String>();
		
		aprovados.put(1, "Pedro");
		aprovados.put(2, "Ana");
		aprovados.put(3, "Bia");
		aprovados.put(4, "Carlos");
		
		System.out.println(aprovados.keySet());
		System.out.println(aprovados.values());
		System.out.println(aprovados.entrySet());
		
		aprovados.put(3, "Beatriz");
		System.out.println(aprovados.get(3));
		System.out.println(aprovados.containsKey(4));
		System.out.println(aprovados.containsValue("Bia"));
		
		System.out.println("Chaves...");
		for (int codigo: aprovados.keySet()) {
			System.out.println(codigo);
		}
			
		System.out.println("Valores...");
		for (String valor: aprovados.values()) {
			System.out.println(valor);
		}
		
		System.out.println("Chave/Valor...");
		for (Entry<Integer, String> registro: aprovados.entrySet()) {
			System.out.println(registro.getKey() + " " + registro.getValue());
		}
	}

}
