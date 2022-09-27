package aplicacao;

import plastico.*;

public class Programa {
	public static void main(String[] args) {

		Plastico plastico = new Plastico("Média", 6);
		Brinquedo brinquedo = new Brinquedo("Alta", 2, "lúdico", "3 anos");

		Garrafa garrafa = new Garrafa("Baixa", 3, 4, 5);
		System.out.println(garrafa.getDensidade());
		System.out.println(brinquedo.getDensidade());

		System.out.println(
				"Imprimindo atributos de plástico: \n " + plastico.getDensidade() + "  " + plastico.getMetros());

	}
}
