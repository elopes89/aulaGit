package empresa;

public class Secretaria extends SalarioEmpregado {

	int qtdAnosEmpresa;

	public int getQtdAnosEmpresa() {
		return qtdAnosEmpresa;
	}

	public void setQtdAnosEmpresa(int qtdAnosEmpresa) {
		this.qtdAnosEmpresa = qtdAnosEmpresa;
	}

	void AtenderCliente() {
		System.out.println("Método atende clientes");
	}

	void RealizarLigacoes() {
		System.out.println("Método Atender telefone");
	}
}
