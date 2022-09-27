package empresa;

public class SalarioEmpregado extends Empregado {
	
	int codigoFuncionario;
	double valorSalario;
	

	public int getCodigoFuncionario() {
		return codigoFuncionario;
	}

	public void setCodigoFuncionario(int codigoFuncionario) {
		this.codigoFuncionario = codigoFuncionario;
	}

	public double getValorSalario() {
		return valorSalario;
	}

	public void setValorSalario(double valorSalario) {
		this.valorSalario = valorSalario;
	}
	
	double CalcularFolhaPagamento(double horas, double valorHora) {
		this.valorSalario = horas * valorHora;
		return valorSalario;
	}
	
}
