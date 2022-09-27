package aplicacao;

import plastico.Garrafa;

public class TesteAcesso extends Garrafa {

	public TesteAcesso(String densidade, int metros, int tamanho, int ml) {
		super(densidade, metros, tamanho, ml);
	}

	public static void main(String[] args) {

		TesteAcesso teste = new TesteAcesso("Alta", 3, 4, 600);

		teste.colocarAGelar();
		teste.encher();
		System.out.println(teste.getTamanho());

	}
}
