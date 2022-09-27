package m2Semana3;

import lombok.Data;

@Data
public class ContaEx {

	private String numeroConta;
	private String agencia;
	private double saldo;
	
	public void deposito(double valor) {
		this.saldo =+ valor;
	}
	
	public void saque(double valor) {
		this.saldo =- valor;
			
	}
}
