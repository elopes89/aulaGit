package cartao;

public abstract class Cartao {
	
	String bandeira;
	double saldo;
	double valorTaxa;
	
	public String getBandeira() {
		return bandeira;
	}

	public void setBandeira(String bandeira) {
		this.bandeira = bandeira;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getValorTaxa() {
		return valorTaxa;
	}

	public void setValorTaxa(double valorTaxa) {
		this.valorTaxa = valorTaxa;
	}

	double VerificarValorTaxaCartao(double saldo, double taxa){
		//saldo = this.saldo;
		double total = saldo * taxa;
		return total;
	}
	
}
