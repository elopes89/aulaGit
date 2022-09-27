package m2Semana3;

public class ex3 {

	public static void main(String[] args) {

		try {
			int[] numeros = { 1, 2, 3 };

			System.out.println("Valor do array: " + numeros[21]);

		} catch (ArrayIndexOutOfBoundsException e) {
			//System.out.println(e.getMessage());
			System.out.println("Fora do índice do array");

		}
	}
}
