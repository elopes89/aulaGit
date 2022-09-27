package m2Semana3;

public class TestaBancoEx {
	public static void main(String[] args) throws ContaNaoExisteException {

		BancoEx pinheiraMoney = new BancoEx();

		ContaEx contaManu = new ContaEx();
		contaManu.setAgencia("2222");
		contaManu.setNumeroConta("123");
		contaManu.setSaldo(10000.0);

		ContaEx contaTrufa = new ContaEx();
		contaTrufa.setAgencia("222");
		contaTrufa.setNumeroConta("456");
		contaTrufa.setSaldo(100.0);

		pinheiraMoney.getContas().add(contaManu);
		pinheiraMoney.getContas().add(contaTrufa);
		
		
		System.out.println("Saldo conta Manu: " + contaManu.getSaldo());
		System.out.println("Saldo conta Trufa: " + contaTrufa.getSaldo());

		try {
			pinheiraMoney.transfere("123", "456", -30);
			pinheiraMoney.transfere("123", "65434", 30);
		} catch (IllegalArgumentException es) {
			System.out.println("Valor errado");
		} catch (ContaNaoExisteException e) {
			System.out.println(e.getMessage());

		}

		System.out.println("Saldo conta Manu: " + contaManu.getSaldo());
		System.out.println("Saldo conta Trufa: " + contaTrufa.getSaldo());
		
	}

}
