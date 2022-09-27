package ex2;

import lombok.Data;

@Data
public class Estudante {
	private String nome;
	private int idade;
	
	public Estudante() {
		
	}
	
	public Estudante(String nome, int idade) {
		this.idade  = idade;
		this.nome = nome;
	}
}
