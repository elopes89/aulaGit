package m2Semana3;

import lombok.Data;

@Data

public class Conta {

	public static int num = 1;

	private int numeroConta;

	private String agencia;

	public Conta() {
		this.numeroConta += num++;

	}

}
