package m2Semana3;

public class ContaNaoExisteException extends Exception {
	public ContaNaoExisteException(String mensagemDeErro) {
		super(mensagemDeErro);
	}

}
