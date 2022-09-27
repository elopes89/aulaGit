package m2Semana1;

//import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class Banco {

	// public static void main(String[] args) {
	List<Conta> contas = new ArrayList<>();

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}

	Conta achaConta(String numeroConta) {
		for (Conta conta : this.contas) {
			if (conta.getNumero() == numeroConta) {
				return conta;
			}
		}
		return null;
	}

	boolean transferencia(String numContaOrigem, String numContaDestino, double valor) {
		Conta contaOrigem = achaConta(numContaOrigem);

		Conta contaDestino = achaConta(numContaDestino);

		if (contaOrigem == null) {
			System.out.println("Conta de origem não existe!");
			 return false;
		}
		if (contaDestino == null) {
			System.out.println("Conta de destino não existe!");
			 return false;
		}
		if (contaOrigem.getSaldo() < valor) {
			System.out.println("Conta de origem não possui saldo");
			 return false;
		}
		contaOrigem.setSaldo(contaOrigem.getSaldo() - valor);
		contaDestino.setSaldo(contaDestino.getSaldo() + valor);
		return true;
	}

}
