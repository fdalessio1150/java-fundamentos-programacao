package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Joao").append(",").append("Maria").append(",").append("Pedro");

		// � mut�vel
//		sb.reverse();
		
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3));

	}

}
