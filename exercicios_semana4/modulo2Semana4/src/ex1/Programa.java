package ex1;

public class Programa {

	public static void main(String[] args) {

		Cachorro cachorro = new Cachorro();
		Gato gato = new Gato();

		gato.nome = "Boris";
		gato.tamanho = 30;
		System.out.println("DADOS DA CLASSE GATO:");
		System.out.println("Nome: " + gato.nome);
		System.out.println("Tamanho: " + gato.tamanho);
		gato.comer();
		gato.andar();
		gato.dormir();

		System.out.println("DADOS DA CLASSE CACHORRO:");
		System.out.println(cachorro.nome = "Max");
		System.out.println(cachorro.tamanho = 40);
		cachorro.comer();
		cachorro.andar();
		cachorro.dormir();

	}

}
