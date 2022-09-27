package plastico;

public class Brinquedo extends Plastico {
	
	private String classificacaoBrinquedo;
	private String faixaEtaria;

	
	


	public Brinquedo(String densidade, int metros, String classificacaoBrinquedo, String faixaEtaria) {
		super(densidade, metros);
		this.classificacaoBrinquedo = classificacaoBrinquedo;
		this.faixaEtaria = faixaEtaria;
	}

	private String getClassificacaoBrinquedo() {
		return classificacaoBrinquedo;
	}

	public void setClassificacaoBrinquedo(String classificacaoBrinquedo) {
		this.classificacaoBrinquedo = classificacaoBrinquedo;
	}

	public String getFaixaEtaria() {
		return faixaEtaria;
	}

	public void setFaixaEtaria(String faixaEtaria) {
		this.faixaEtaria = faixaEtaria;
	}


	void brincar() {
		System.out.println("Se divertindo");
	}
	
	void descartar() {
		System.out.println("Perdeu a graça");
	}
}
