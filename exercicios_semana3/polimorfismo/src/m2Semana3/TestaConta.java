package m2Semana3;

public class TestaConta {

	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.setAgencia("1234");
		System.out.println(conta.getAgencia());
		System.out.println(conta.getNumeroConta());
		
		Conta conta1 = new Conta();
		System.out.println(conta1.getNumeroConta());
		
		Conta conta2 = new Conta();
		System.out.println(conta2.getNumeroConta());
	}
	

}
