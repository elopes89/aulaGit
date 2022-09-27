package ex2;

import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

		String nome = "";
		String nomeProfessor = "";

		int idade;
		int idadeProfessor;

		Scanner s = new Scanner(System.in);
		System.out.println("NOME DO ALUNO: ");
		nome = s.next();
		System.out.println("IDADE DO ALUNO: ");
		idade = s.nextInt();
		Estudante estudante = new Estudante(nome, idade);

		System.out.println("NOME DO PROFESSOR: ");
		nomeProfessor = s.next();
		System.out.println("IDADE DO PROFESSOR: ");
		idadeProfessor = s.nextInt();

		Professor professor = new Professor(nomeProfessor, idadeProfessor);

		System.out.println("O professor de Java do aluno: " + estudante.getNome() + " é: " + professor.getNome()
				+ " de: " + professor.getIdade() + " anos");
	s.close();
	}

}
