package empresa;

public class Programa {

	public static void main(String[] args) {

		System.out.println("CLASSE FUNCIONARIOHORISTA");
		FuncionarioHorista fh = new FuncionarioHorista();
		System.out.println("valor a receber: " + fh.CalcularTaxas(50, 10));
		System.out.println("Taxa: " + fh.getTaxa());
		fh.setCnpj("7387837839/009");
		System.out.println(fh.getCnpj());
		fh.EmitirNota();
		fh.Trabalhar();

		System.out.println("CLASSE SECRETÁRIA");
		Secretaria sc = new Secretaria();
		sc.setQtdAnosEmpresa(10);
		System.out.println("Anos de empresa: " + sc.getQtdAnosEmpresa());
		sc.AtenderCliente();
		sc.RealizarLigacoes();

		System.out.println("CLASSE SALARIOEMPREGADO");
		SalarioEmpregado se = new SalarioEmpregado();
		se.setCodigoFuncionario(12589);
		System.out.println("Código do funcionário: " + se.getCodigoFuncionario());
		se.setValorSalario(5000.0);
		System.out.println("Rendimentos: " + se.getValorSalario());
		se.setNome("João da Silva");
		System.out.println("Nome do funcionário: " + se.getNome());
		System.out.println("Cálculo do salário: " + se.CalcularFolhaPagamento(40, 50));

		System.out.println("CLASSE EMPREGADO");
		Empregado empregado = new Empregado();
		empregado.setId(43);
		System.out.println("Id empregado: " + empregado.getId());
		System.out.println(empregado.TirarFolga());

	}
}
