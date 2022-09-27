package plastico;

public class Plastico {
	 String densidade;
	int metros;

	public Plastico(String densidade, int metros) {
		super();
		this.densidade = densidade;
		this.metros = metros;
	}

	public String getDensidade() {
		return densidade;
	}

	public void setDensidade(String densidade) {
		this.densidade = densidade;
	}

	public int getMetros() {
		return metros;
	}

	public void setMetros(int metros) {
		this.metros = metros;
	}

	void derreter() {
		System.out.println("DERRETENDO... PLÁSTICO");
	}
	
	protected void preparar() {
		System.out.println("Preparando o plástico");
	}

}