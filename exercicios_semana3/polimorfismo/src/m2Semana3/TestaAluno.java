package m2Semana3;

public class TestaAluno {

	public static void main(String[] args) {

		SuperAluno superAluno = new SuperAluno();
		SuperAluno subSuperAluno = new SubAluno();
		SubAluno subAluno = new SubAluno();

		superAluno.exibir();
		subSuperAluno.exibir();
		subAluno.exibir();

	}

}
