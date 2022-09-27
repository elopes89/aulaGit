package m2Semana1;

public class Ex4Recursao {
	static int i = 0;

	private static void reverse(char[] str, int k) {
		if (k == str.length) {
			return;
		}

		reverse(str, k + 1);

		if (i <= k) {
			char temp = str[k];
			str[k] = str[i];
			str[i++] = temp;
		}
	}

	public static String reverse(String str) {
		if (str == null || str.equals("")) {
			return "Valor nulo ou vazio";
		}

		char[] A = str.toCharArray();

		reverse(A, 0);

		return String.copyValueOf(A);
	}

	public static void main(String[] args) {
		String str = "123456";

		str = reverse(str);

		System.out.println("Ao contrário fica: " + str);
	}
}
