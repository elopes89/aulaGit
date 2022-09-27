package empresa;

public class FuncionarioHorista extends Empregado {
	String cnpj;
	double taxa;

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public double getTaxa() {
		return taxa;
	}

	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}

	void EmitirNota() {
		System.out.println("CNPJ: " +this.cnpj + " Nota Fiscal emitida com sucesso" + this.taxa);
	}

	double CalcularTaxas(double valor, double horas) {
		this.taxa = valor * horas;
		return this.taxa;
	}
	
	void Trabalhar() {
		System.out.println("Trabalha por conta");
	}

}
