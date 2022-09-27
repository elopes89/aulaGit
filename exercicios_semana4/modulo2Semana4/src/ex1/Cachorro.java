package ex1;

public class Cachorro implements Animal{


	float tamanho;
	String nome;
	
	@Override
	public void comer() {
		System.out.println("Adora comer...");
	}

	@Override
	public void andar() {
		System.out.println("Se move lentamente");
	}

	@Override
	public void dormir() {
		System.out.println("Dorme bem");
	}
}
