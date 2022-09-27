package ex1;

public class Gato implements Animal {

	float tamanho;
	String nome;
	
	@Override
	public void comer() {
		System.out.println("Adora ração");
	}

	@Override
	public void andar() {
		System.out.println("Se move rápido");
	}

	@Override
	public void dormir() {
		System.out.println("Dorme muito");
	}
 
}
