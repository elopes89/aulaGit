package cartao;

public class ProgramaCartao {
	public static void main(String[] args) {

		VR vr = new VR();
		vr.setBandeira("Cartão Visa Refeição");
		System.out.println(vr.getBandeira());
		vr.setSaldo(600.0);
		System.out.println("saldo: " + vr.getSaldo());
		vr.setValorTaxa(0.07);
		System.out.println(vr.getValorTaxa());
		System.out.printf("Taxa do cartão: %.2f \n", vr.VerificarValorTaxaCartao(vr.saldo, vr.valorTaxa));

		VA va = new VA();
		va.setBandeira("Cartão Visa alimentação");
		System.out.println(va.getBandeira());
		va.setSaldo(100.0);
		System.out.println("saldo: " + va.getSaldo());
		va.setValorTaxa(0.02);
		System.out.println(va.getValorTaxa());
		System.out.println("Taxa do cartão: " + va.VerificarValorTaxaCartao(va.saldo, va.valorTaxa));

		VT vt = new VT();
		vt.setBandeira("Cartão Sim Floripa");
		System.out.println(vt.getBandeira());
		vt.setSaldo(200.0);
		System.out.println("saldo: " + vt.getSaldo());
		vt.setValorTaxa(0.04);
		System.out.println(vt.getValorTaxa());
		System.out.println("Taxa do cartão: " + vt.VerificarValorTaxaCartao(vt.saldo, vt.valorTaxa) + " reais");

	}

}
