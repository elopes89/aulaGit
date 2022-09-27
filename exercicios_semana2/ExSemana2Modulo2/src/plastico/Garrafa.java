package plastico;

public class Garrafa extends Plastico {
	int tamanho;
	int ml;

	protected void encher() {
		System.out.println("Está meio cheio");
	}

	public Garrafa(String densidade, int metros, int tamanho, int ml) {
		super(densidade, metros);
		this.tamanho = tamanho;
		this.ml = ml;
	}

	protected void colocarAGelar() {
		System.out.println("Gelando");
	}

	public int getTamanho() {
		return tamanho;
	}

	public void setTamanho(int tamanho) {
		this.tamanho = tamanho;
	}

	public int getMl() {
		return ml;
	}

	public void setMl(int ml) {
		this.ml = ml;
	}

}
